package com.jetbrains.inspections;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings({"unused", "Convert2MethodRef", "OptionalUsedAsFieldOrParameterType"})
public class Java11Inspections {

    private void localVariableSyntaxForLambdaParameters() {
        // these two are both valid for Java 8 onwards
        BiConsumer<Processor, String> consumer = (Processor x, String y) -> x.process(y);
        //can run inspection to remove redundant param types to get the following
        BiConsumer<Processor, String> consumer2 = (x, y) -> x.process(y);

        // now valid in Java 11, although dubious value in this form (when one can remove the type entirely, as per consumer2 example)
        BiConsumer<Processor, String> consumer3 = (var x, var y) -> x.process(y);

        // LVTI for lambdas makes more sense when you need to apply annotations to the params
        BiConsumer<Processor, String> consumer4 = (@NotNull var x, @Nullable var y) -> x.process(y);
        //...because this is not allowed
//        BiConsumer<Processor, String> consumer5 = (@NotNull x, @Nullable y) -> x.process(y);

        // We can convert to var instead of removing all types when removing redundant param types
        BiConsumer<Processor, String> consumer6 = (@NotNull Processor x, String y) -> x.process(y);
    }

    void suggestFilesReadWriteString() throws IOException {
        byte[] bytes = "Hello World!".getBytes(StandardCharsets.UTF_8);
        Files.write(Paths.get("/path/to/file"), bytes);
    }

    List<String> suggestAsMatchPredicate(List<String> list) {
        final Pattern digits = Pattern.compile("\\d+");

        return list.stream()
                   .filter(id -> digits.matcher(id).matches()) // suggestion here, not highlighted
                   .collect(Collectors.toUnmodifiableList());
    }

    // NOTE: no inspection
    public List<String> usePredicateNot(Stream<String> stream) {
        return stream.filter(s -> !s.isEmpty())
                     .collect(Collectors.toUnmodifiableList());
//        return stream.filter(Predicate.not(String::isEmpty))
//                     .collect(Collectors.toUnmodifiableList());
    }

    public static void main(String[] args) throws IOException {
        try (FileWriter writer = new FileWriter("hello.txt")) { //suggestion turned off by default
            writer.write("Hello World!");
        }
    }

    @FunctionalInterface
    private interface Processor {
        void process(String str);
    }
}

package com.jetbrains.code;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiConsumer;

@SuppressWarnings({"unused", "Convert2MethodRef"})
public class Java11 {

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

//    private void idea193514() {
//        BiFunction<String[], String, String> f5 = (var s1[], var s2) -> s2;
//    }

    private interface Processor {
        void process(String str);
    }
}

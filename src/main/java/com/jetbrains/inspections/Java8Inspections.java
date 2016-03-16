package com.jetbrains.inspections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by breandan on 2/9/2015.
 */
public class Java8Inspections {
    public void lambdas() {
        //Anonymous function Function<Function, Function>() can be replaced with lambda
        Function<Function, Function> f1 = new Function<Function, Function>() {
            @Override
            public Function apply(Function function) {
                return function.compose(function);
            }
        };

        //Expand lambda expression body to {...}
        Function<Function, Function> f2 = function -> function.compose(function);

        //Remove redundant types
        Function<Function, Function> f3 = (Function function) -> function.compose(function);

        //Statement lambda can be replaced with expression lambda
        Function<Function, Function> f4 = (Function function) -> {
            return function.compose(function);
        };

        //Lambda can be replaced with method reference
        String[] stringArray = {"IntelliJ IDEA", "AppCode", "CLion", "0xDBE", "Upsource"};
        Arrays.sort(stringArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
       
        //Replace with forEach
        ArrayList<String> foo = new ArrayList<>();
        for (String s : foo) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public void methodReferences(Predicate<Integer> predicate) {
        //Method reference can be replaced with qualifier
        List<Integer> integers = IntStream.range(0, 100)
                .boxed()
                .filter(predicate::test)
                .collect(Collectors.toList());
    }

    public void trivialLambdaUsage() {
        ((Runnable) () -> {
            //Do some work
            System.out.println("Hello");
        }).run();

        String s = ((Supplier<String>) () -> "Hello").get();
    }

    public void optionals(Optional<String> optionalString) {
        optionalString.get();
        if(optionalString.isPresent())
            optionalString.get();
    }
}

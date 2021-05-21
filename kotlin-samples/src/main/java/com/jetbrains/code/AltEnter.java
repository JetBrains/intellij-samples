package com.jetbrains.code;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

import static java.util.Arrays.sort;

@SuppressWarnings({"rawtypes", "unchecked", "unused", "MismatchedReadAndWriteOfArray"})
public class AltEnter {
    private final String[] stringArray = new String[]{"IntelliJ IDEA", "Space", "Code With Me", "TeamCity"};

    public void error() {
        // uncomment to see error highlighted, and to look at suggested fixed
//        List<String> strings = new HashMap<Integer, String>();
    }

    public void lambdas() {
        //Lambda can be replaced with method reference
        sort(stringArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

        //Statement lambda can be replaced with expression lambda, and then Expand lambda expression body to {...}
        Function<Function, Function> f4 = (Function function) -> {
            return function.compose(function);
        };

        //Remove redundant types
        Function<Function, Function> f3 = (Function function) -> function.compose(function);
    }
}

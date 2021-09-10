package com.jetbrains.code.jdk17;

import java.util.List;

@SuppressWarnings("unused")
public class PatternMatchingSwitch {
    static String exampleJEP406OriginalCode(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (o instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (o instanceof Double d) {
            formatted = String.format("double %f", d);
        } else if (o instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }

    static String exampleJEP406PatternMatchingForSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

    static void shouldSuggestMigratingToPatternMatchingForSwitch(Object x) {
        if (x instanceof String) {
            System.out.println(x);
        } else if (x instanceof Integer) {
            Integer integer = (Integer) x;
            System.out.println(integer + 1);
        } else if (x instanceof List<?>) {
            System.out.println(((List<?>) x).size());
        } else {
            throw new IllegalArgumentException("Unexpected type: " + x);
        }
    }

    static void testFooBar(String s) {
        switch (s) {
            case null -> System.out.println("Oops");
            case "Foo", "Bar" -> System.out.println("Great");
            default -> System.out.println("Ok");
        }
    }
}

package com.jetbrains.code.jdk21;

import java.util.List;

/**
 * <ul>
 *     <li>#PreviewFeature First Preview #JDK17</li>
 *     <li>#StandardFeature #JDK21</li>
 * </ul>
 * See: <a href="https://openjdk.org/jeps/441">JEP 441</a>
 */
@SuppressWarnings("unused")
public class PatternMatchingForSwitch {
    // Prior to Java 21
    static String exampleJEP411OriginalCode(Object obj) {
        String formatted = "unknown";
        if (obj instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (obj instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (obj instanceof Double d) {
            formatted = String.format("double %f", d);
        } else if (obj instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }

    // As of Java 21
    static String formatterPatternSwitch(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> obj.toString();
        };
    }

    static void shouldSuggestMigratingToPatternMatchingForSwitch(Object x) {
        if (x instanceof String) {
            System.out.println(x);
        } else if (x instanceof Integer) {
            Integer integer = (Integer) x;
            System.out.println(integer + 1);
        } else if (x instanceof List<?> list) {
            System.out.println(list.size());
        } else {
            throw new IllegalArgumentException("Unexpected type: " + x);
        }
    }

    static void shouldSuggestMigratingMoreComplexExampleToPatternMatchingForSwitch(Object x) {
        if (x instanceof String str && !str.isEmpty()) {
            System.out.println(str);
        } else if (x instanceof Integer integer && integer > 0) {
            System.out.println(integer + 1);
        } else if (x instanceof List<?> list && !list.isEmpty()) {
            System.out.println(list.size());
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

    // As of Java 21
    static void testStringNew(String response) {
        switch (response) {
            case null -> {}
            case "y", "Y" -> System.out.println("You got it");
            case "n", "N" -> System.out.println("Shame");
            case String s
                    when s.equalsIgnoreCase("YES") -> System.out.println("You got it");
            case String s
                    when s.equalsIgnoreCase("NO") -> System.out.println("Shame");
            case String s -> {
                System.out.println("Sorry?");
            }
        }
    }
}

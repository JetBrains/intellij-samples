package com.jetbrains.code;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
// There's a view for every occasion
// Use Find Action ⌘⇧A (macOS), Ctrl+Shift+A (Windows/Linux) to:
// 1. Enter Presentation mode
// 2. Enter Distraction free mode
// 3. Enter Full screen mode
// 4. Enter Zen mode

public class JavaAt25 {
    private void weLoveCollections() {
        final List<String> strings = new ArrayList<>();
        final Map<Integer, String> map = new HashMap<>();
        final Set<Integer> integers = new HashSet<>();
    }

    private void weLoveCollectionsFactories() {
        List<String> unmodifiableListOfStrings = List.of("Some", "Thing", "Here");
        Map<Integer, String> unmodifiableMap = Map.of(23, "the value", 49, "another value");
        Set<Integer> unmodifiableSet = Set.of(4, 765654, 3);
    }

    private void weLoveTheStreamsAPI() {
        List<String> unmodifiableListOfStrings = List.of("Some", "Thing", "Here");

        List<String> listOfStrings = unmodifiableListOfStrings.stream()
                                                              .filter(s -> s.startsWith("S"))
                                                              .sorted()
                                                              .collect(Collectors.toUnmodifiableList());
    }

    private void weLoveLambdaExpressions() {
        Map<Integer, String> unmodifiableMap = Map.of(23, "the value", 49, "another value");
        String csv = unmodifiableMap.values().stream()
                                    .map(String::toUpperCase)
                                    .collect(Collectors.joining(","));
        unmodifiableMap.computeIfAbsent(12, Object::toString);
    }

    private void weLoveOptional() {
        List<String> unmodifiableListOfStrings = List.of("Some", "Thing", "Here");

        Optional<String> aValue = unmodifiableListOfStrings.stream()
                                                           .filter(s -> s.equals("Some"))
                                                           .findFirst();
        aValue.ifPresentOrElse(System.out::println, () -> System.out.println("Doesn't exist!"));
    }

    private void weLoveJavaTime() {
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();

        LocalDateTime oneWeekAndOneDayAgo = now.minusDays(8);

        LocalDate java25Birthday = LocalDate.of(2020, 5, 23);
    }

    private void weLoveCheckedExceptionsSometimes() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        try {
            Date date = dateFormat.parse("Definitely not a date");
        } catch (ParseException e) {
            System.out.println("This is not a date");
        }
    }

    @Contract(pure = true)
    private @NotNull String weLoveAnnotations() {
        return "This can never be null";
    }

    private void weLoveVarWhereAppropriate() {
        var s = "My String";
        var integers = List.of(1, 2, 3, 4);
    }

    private void weLoveAccessModifiers() {
        new MyInnerClass();
    }

    private String weLoveSwitchExpressions(int someValue) {
        return switch (someValue) {
            case 1 -> "first value";
            case 2 -> "second value";
            default -> throw new IllegalStateException("Unexpected value: " + someValue);
        };
    }

    private void weLoveHelpfulNullPointerExceptions() {
        System.out.println(getEmailAddress().toString());
    }

    private void weLoveNewPreviewFeatures() {
        var name = new MyRecord(1, "name");
    }

    private void happyBirthdayJava() {
        System.out.println("Happy 25th Birthday Java!");
    }

    private String getEmailAddress() {
        return null;
    }

    static class MyInnerClass {
    }

    private record MyRecord(int id, String name) { }
}



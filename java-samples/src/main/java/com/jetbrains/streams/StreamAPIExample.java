package com.jetbrains.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
//import java.util.stream.Collectors;
import java.util.stream.*;

import static java.util.stream.Collectors.*;


class StreamAPIExample {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(385, 245, 62, 111);
        List<String> fruit = Arrays.asList("pear", "apple", "clementine");
        List<String> months1 = List.of("Jan", "Feb", "Mar");
        List<String> months2 = List.of("Apr", "May", "June");
        List<String> months3 = List.of("Jul", "Aug", "Sep");
        List<String> months4 = List.of("Oct", "Nov", "Dev");
        List<List<String>> months = List.of(months1, months2, months3, months4);

        // Sort a list, no need to type .stream()
        List<Integer> sorted = numbers.stream()
                                      .sorted()
                                      .toList();
        sorted.forEach(System.out::println);

        // Convert to uppercase, no need to type .stream
        List<String> fruitUpperCase = fruit.stream()
                                           .map(String::toUpperCase)
                                           .toList();
        fruitUpperCase.forEach(System.out::println);

        // Flatten collections, no need to type .stream()
        List<String> listMonths = months.stream()
                                        .flatMap(Collection::stream)
                                        .toList();
        listMonths.forEach(System.out::println);
    }
}

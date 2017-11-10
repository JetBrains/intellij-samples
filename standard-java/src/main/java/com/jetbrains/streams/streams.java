package com.jetbrains.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StreamExample {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("pear", "apple", "clementine");
        List<String> result = lines.stream()
                .filter(line -> !"apple".equals(line))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

    public List<String> asSortedList(String[] args) {
        List<String> list = Arrays.stream(args).collect(Collectors.toList());
        list.sort(null);
        return list;
    }

}

package com.jetbrains.editing;

import java.util.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

@SuppressWarnings("unused")
public class ExtendSelection {
    private Set<Map.Entry<String, Long>> exampleCodeForExtendAndShrinkSelection() {
        return getStrings().stream()
                .collect(groupingBy(stringValue -> stringValue, counting()))
                .entrySet();
    }

    private List<String> getStrings() {
        return new ArrayList<>();
    }
}

package com.jetbrains.inspections;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.unmodifiableList;

@SuppressWarnings("unused")
public class StreamsAPI {

    // #ModernJava
    public List<String> replaceUnmodifiableListWrapperWithUnmodifiableListCollector(List<String> strings) {
        // inspection only works in Java 10 and above
        return unmodifiableList(strings.stream()
                                       .filter(s -> s.startsWith("S"))
                                       .sorted()
                                       .collect(Collectors.toList()));
    }

    // #JDK16 #2021.1
    public List<String> convertCollectorCallIntoToListCall(List<String> strings) {
        return strings.stream()
                      .filter(s -> s.startsWith("S"))
                      .sorted()
                      .collect(Collectors.toUnmodifiableList());
    }

}

package com.jetbrains.inspections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;

@SuppressWarnings("unused")
public class Java9Inspections {
    private static final List<String> EXAMPLE_LIST =
            Collections.unmodifiableList(Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee"));

    private static final Set<String> EXAMPLE_SET
            = Collections.unmodifiableSet(new HashSet<>(asList("HAPPY", "SAD")));

    private String useNewObjectsStaticMethod(final String someValue) {
        if (someValue == null) {
            return "defaultValue";
        } else {
            return someValue;
        }
    }
}

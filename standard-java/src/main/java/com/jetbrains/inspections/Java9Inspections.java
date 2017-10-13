package com.jetbrains.inspections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Arrays.asList;

@SuppressWarnings("unused")
public class Java9Inspections {
    private static final List<String> EXAMPLE_LIST =
            Collections.unmodifiableList(Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee"));

    private static final Set<String> EXAMPLE_SET
            = Collections.unmodifiableSet(new HashSet<>(asList("HAPPY", "SAD")));

    private static final Map<String, Integer> WORD_TO_SCORE = Collections.unmodifiableMap(new HashMap<>() {
        {
            put("happy", 3);
            put("good", 3);
            put("great", 3);
            put("keen", 2);
            put("awesome", 2);
            put("marvelous", 2);
            put("yay", 14);
            put("pleased", 14);
            put("sad", 1);
            put("mad", 1);
            put("blargh", 8);
            put("boo", 8);
            put("terrible", 8);
            put("horrible", 2);
            put("bad", 2);
            put("awful", 2);
        }
    });


    private String useNewObjectsStaticMethod() {
        String someValue = getSomeValue();

        if (someValue != null) {
            return someValue;
        }
        return "default";
    }

    private String getSomeValue() {
        return null;
    }
}

package com.jetbrains.inspections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("unused")
public class RedundantCode {
    private final Map<String, Integer> mapWithDuplicateKeys = new HashMap<>() {{
        put("a", 1);
        put("b", 2);
        put("a", 3);
    }};

    private final Set<String> setWithDuplicateValues = new HashSet<>() {{
        add("a");
        add("b");
        add("a");
    }};

}

package com.jetbrains.inspections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class NewInspections {
    private List<String> mutableCollection = new ArrayList<>();

    private Map<String, Integer> mapWithDuplicateKeys = new HashMap<>() {{
        put("a", 1);
        put("b", 2);
        put("a", 3);
    }};

    private Set<String> setWithDuplicateValues = new HashSet<>() {{
        add("a");
        add("b");
        add("a");
    }};

    public List<String> getList() {
        return mutableCollection;
    }

    public boolean compareWith1(CharSequence charSequence) {
        final StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.equals(charSequence);
    }

    public boolean compareWith2(CharSequence charSequence) {
        return "Some String".equals(charSequence);
    }

    public void regexp() {
        final Pattern pattern = Pattern.compile("[\\.]");
    }

    public void quickFix(String someValue) {
        if (someValue.isEmpty()) {
            //ignore
        }
    }

    //intention
    public void unrollLoop() {
        int[] ints = {1, 2, 3};
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public boolean compare(MyClass myClass) {
        return myClass.equals(new MyClass());
    }

    private final class MyClass {
    }
}

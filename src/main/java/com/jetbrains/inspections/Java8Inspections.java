package com.jetbrains.inspections;

import com.jetbrains.inspections.entities.Counter;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.lang.System.out;
import static java.util.Arrays.sort;
import static java.util.stream.Collectors.toList;

@SuppressWarnings("unused")
public class Java8Inspections {
    private final Map<Integer, List<String>> integerStringMap = new HashMap<>();

    private final String[] stringArray = new String[]{"IntelliJ IDEA", "AppCode", "CLion", "0xDBE", "Upsource"};

    public void lambdas() {
        //Anonymous function Function<Function, Function>() can be replaced with lambda
        Function<Function, Function> f1 = new Function<Function, Function>() {
            @Override
            public Function apply(Function function) {
                return function.compose(function);
            }
        };

        //Expand lambda expression body to {...}
        Function<Function, Function> f2 = function -> function.compose(function);

        //Remove redundant types
        Function<Function, Function> f3 = (Function function) -> function.compose(function);

        //Statement lambda can be replaced with expression lambda
        Function<Function, Function> f4 = (Function function) -> {
            return function.compose(function);
        };

        //Lambda can be replaced with method reference
        sort(stringArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

        //Replace with forEach on foo
        ArrayList<String> foo = new ArrayList<>();
        for (String s : foo) {
            if (s != null) {
                out.println(s);
            }
        }
    }

    private int replaceWithCountSimple() {
        int count = 0;

        for (String s : stringArray) {
            count++;
        }

        return count;
    }

    private int replaceWithCountNested() {
        int count = 0;

        for (List<String> list : integerStringMap.values()) {
            if (list != null) {
                for (String stringVal : list) {
                    if (stringVal.contains("error")) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private int replaceWithSum() {
        int count = 0;

        for (String s : stringArray) {
            count += s.length();
        }

        return count;
    }

    private int replaceWithMapToInt() {
        int count = 0;

        for (List<String> list : integerStringMap.values()) {
            if (list != null) {
                for (String stringVal : list) {
                    if (stringVal.contains("error")) {
                        count += stringVal.length();
                    }
                }
            }
        }

        return count;
    }

    private List<String> replaceWithCollect() {
        List<String> result = new ArrayList<>();

        for (String line : stringArray) {
            if (line != null) {
                for (String word : line.split("\\s")) {
                    result.add(word);
                }
            }
        }
        return result;
    }

    private List<String> replaceWithCollectAndMap() {
        List<String> result = new ArrayList<>();

        for (String line : stringArray) {
            if (line != null) {
                for (String word : line.split(" ")) {
                    result.add(word.substring(0, 3));
                }
            }
        }
        return result;
    }

    // missing an example for "continue" as it looked a bit complicated to type

    private List<String> getListOfAllNonEmptyStringValues(Map<String, List<String>> map) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey().isEmpty()) {
                continue;
            }
            List<String> list = entry.getValue();
            if (list == null) {
                continue;
            }
            for (String str : list) {
                String trimmed = str.trim();
                if (trimmed.isEmpty()) {
                    continue;
                }
                result.add(trimmed);
            }
        }
        return result;
    }

    private boolean hasEmptyString(String[][] data) {
        for (String[] row : data) {
            for (String str : row) {
                if (str.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void incrementCounterForId(Map<Integer, Counter> idToCounter, Integer id) {
        Counter counter = idToCounter.get(id);
        if (counter == null) {
            counter = new Counter();
            idToCounter.put(id, counter);
        }
        counter.incrementCount();
    }

    private Counter getCounterForId(Map<Integer, Counter> idToCounter, Integer id) {
        Counter counter = idToCounter.get(id);
        if (counter == null) {
            counter = Counter.EMPTY;
        }
        return counter;
    }

    private void removeIfCountExceedsLimit(Collection<Counter> counters) {
        Predicate<Counter> predicate = (c) -> c.getCount() > 100;

        Iterator<Counter> iterator = counters.iterator();
        while (iterator.hasNext()) {
            Counter counter = iterator.next();
            if (predicate.test(counter)) {
                iterator.remove();
            }
        }
    }

    private String getOptionalValue(Optional<String> firstOptional, Optional<String> secondOptional) {
        if (!firstOptional.isPresent() || !secondOptional.isPresent()) {
            throw new IllegalArgumentException("Neither Optional should not be empty");
        }
        return firstOptional.get() + secondOptional.get();
    }

    private String getOptionalValue(Optional<String> anOptional, boolean flag) {
        if (flag || anOptional.isPresent()) {
            return anOptional.get();
        }
        return "";
    }

    private String useOptionalProperlyOrElse(Optional<String> anOptional) {
        if (anOptional.isPresent()) {
            return anOptional.get();
        }
        return "";
    }

    private List<Counter> findTopTenAlt(List<Counter> counters) {
        return counters.stream()
                       .sorted((o1, o2) -> o1.getCount() - o2.getCount())
                       .limit(10)
                       .collect(toList());

    }

    private List<Counter> findTopTen(List<Counter> counters) {
        return counters.stream()
                       .sorted((o1, o2) -> o1.compareTo(o2))
                       .limit(10)
                       .collect(toList());

    }

}

package com.jetbrains.inspections;

import com.jetbrains.inspections.entities.Converter;
import com.jetbrains.inspections.entities.Counter;
import com.jetbrains.inspections.entities.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.Arrays.sort;
import static java.util.stream.Collectors.toList;

@SuppressWarnings({"unused", "unchecked"})
public class Java8Inspections {
    private final Map<Integer, List<String>> integerStringMap = new HashMap<>();

    private final String[] stringArray = new String[]{"IntelliJ IDEA", "AppCode", "CLion", "0xDBE", "Upsource"};
    private List<Converter> converters;

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

    private List<String> getListOfAllNonEmptyStringValues(Map<String, List<String>> map) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey()
                     .isEmpty()) {
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

    //Streams: findFirst
    private Converter getFirstConverterForClass(final Class aClass) {
        for (final Converter converter : converters) {
            if (converter.canHandle(aClass)) {
                return converter;
            }
        }
        return Converter.IDENTITY_CONVERTER;
    }

    //Arrays: findFirst
    public String toCountedLoopInFindFirst(int[] data, List<String> info) {
        for (int val : data) {
            for (int x = 0; x <= val; x++) {
                String str = info.get(x);
                if (!str.isEmpty()) {
                    return str;
                }
            }
        }
        return null;
    }

    //Streams: toArray
    public String[] replaceWithToArray(List<String> data) {
        List<String> result = new ArrayList<>();
        for (String str : data) {
            if (!str.isEmpty()) {
                result.add(str);
            }
        }
        return result.toArray(new String[0]);
    }

    //Streams: sorting
    public List<String> getSortedListOfNames(List<Person> persons) {
        List<String> names = new ArrayList<>();
        for (Person person : persons) {
            names.add(person.getName());
        }
        Collections.sort(names, String::compareToIgnoreCase);
        return names;
    }

    public long countNumberOfItems(List<String> strings) {
        return strings.stream()
                      .count();
    }

    //2017.3
    public String[] fuseStepsIntoStream() {
        final Stream<String> stream = Stream.of("a", "b", "c");

        final List<String> strings = stream.collect(Collectors.toList());
        strings.sort(Comparator.naturalOrder());

        return strings.toArray(new String[0]);
    }

    public Stream<Object> simplifyStreamAPICallChain1() {
        return Collections.nCopies(10, "")
                          .stream()
                          .map(s -> doMapping());
    }

    public boolean simplifyStreamAPICallChain2() {
        final Stream<String> stream = Stream.of("a", "b", "c");
        return stream.filter(this::stringMatchesSomeCriteria)
                     .count() > 0;
    }

    public Stream<Object> simplifyStreamAPICallChain3(Object[] array) {
        return IntStream.range(1, 10)
                        .mapToObj(value -> array[value]);
    }

    static String turnIntoLowerCase(List<String> words) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            String toLowerCase = word.toLowerCase();
            stringBuilder.append(toLowerCase);
            stringBuilder.append(",");
        }

        return stringBuilder.toString();
    }

    public void simplifyMatchOperations(List<String> list) {
        if (!list.isEmpty()) {
            return;
        }

        final boolean hasNoNulls = list.stream()
                                       .allMatch(Objects::nonNull);
        doSomething(hasNoNulls);

        final Optional<Object> first = Stream.empty()
                                             .findFirst();
        doSomething(first.isPresent());

        final Optional<Object> any = Stream.empty()
                                           .findAny();
        doSomething(any.isPresent());

        //min, max, reduce
        final Optional<Object> min = Stream.empty()
                                           .min(Comparator.comparing(Object::toString));
        doSomething(min.isPresent());

        //sum & count
        final long count = IntStream.empty()
                                    .count();
        doSomething(count);

        final int sum = IntStream.empty()
                                 .sum();
        doSomething(sum);
    }

    public void nullabilityAnalysis(String[] stringArray) {
        Arrays.stream(stringArray)
              .map(s -> s.isEmpty() ? s : null)
              .map(String::trim)
              .collect(Collectors.toList());
    }


    public void simplifyOptionalCallChains1() {
        Optional<String> optional = getOptional();

        final Optional<String> trimOptional = optional.map(s -> Optional.of(s.trim()))
                                                      .orElse(Optional.empty());
    }

    public String simplifyOptionalCallChains2() {
        Optional<String> optional = getOptional();

        String value = optional.orElse(null);
        return value == null ? "default" : value;
    }

    public void simplifyOptionalCallChains3() {
        Optional<String> optional = getOptional();

        String value = optional.orElse(null);
        if (value != null) {
            System.out.println(value);
        }
    }

    public Optional<String> unnecessaryWrapping() {
        final Optional<String> optional = getOptional();

        return Optional.ofNullable(Stream.of("1", "2", "3")
                                         .filter(Objects::nonNull)
                                         .findFirst()
                                         .orElse(null));
    }

    @SuppressWarnings("OptionalIsPresent")
    public Optional<String> warnAboutWrappingOptional() {
        final Optional<String> optional = getOptional();
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return Optional.empty();
    }

    @SuppressWarnings("SimplifyOptionalCallChains")
    public Optional<String> suggestJava9Or() {
        final Optional<String> optional = getOptional();
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return getAlternativeOptional();
    }


    //helpers
    private void doSomething(boolean hasNoNulls) {

    }

    private void doSomething(long count) {

    }

    private Optional<String> getAlternativeOptional() {
        return Optional.empty();
    }

    private Optional<String> getOptional() {
        return Optional.empty();
    }

    private <R> R doMapping() {
        return null;
    }

    private boolean stringMatchesSomeCriteria(String s) {
        return false;
    }


}

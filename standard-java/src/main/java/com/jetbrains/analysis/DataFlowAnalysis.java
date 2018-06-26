package com.jetbrains.analysis;

import org.hamcrest.Matchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SuppressWarnings({"StatementWithEmptyBody", "unused", "Java9CollectionFactory", "MismatchedQueryAndUpdateOfCollection"})
public class DataFlowAnalysis {

    //<editor-fold desc="Other Data Flow Examples">
    public void showDataFlowWithInstanceOfExample(Object obj) {
        if (obj instanceof String || obj instanceof Number) {
            System.out.println("String or Number");
        } else {
            //press Ctrl+Shift+P twice on `obj`
            System.out.println(obj);
        }
    }

    public void showDataFlowWithOptionalExample() {
        Optional<String> optional = getAnOptional();
        if (optional.isPresent()) {

        }
    }

    public void showDataFlowWithNumericExample(int intValue) {
        if (intValue > 100) {
            return;
        } else if (intValue == 53) {
            System.out.println("This is a special value");
        } else if (intValue == 13) {
            throw new IllegalArgumentException("Invalid value");
        } else if (intValue < -10) {
            throw new IllegalArgumentException("Number too low");
        }

        //press Ctrl+Shift+P twice on `intValue`
        System.out.println(intValue);
    }

    private static List<Integer> returnsImmutableResult() {
        return Collections.unmodifiableList(Arrays.asList(1, 2, 3));
    }

    private void usesUnmodifiableList() {
        returnsImmutableResult().add(4);
    }



    public void knowsAboutEmptyArrayLists() {
        ArrayList<String> strings = new ArrayList<>();

        String s = strings.get(1);
    }

    private void unrollsStreamOf() {
        Optional<String> optionalOne = Optional.of("foo");
        Optional<String> optionalTwo = Optional.of("bar");

        if (Stream.of(optionalOne, optionalTwo).allMatch(Optional::isPresent)) { //extra information
            String one = optionalOne.get(); // no warning
        }
    }

    private void shouldKnowValuesForUpToThreeItemsInStreamOf() {
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        if (Stream.of(a, b, c).allMatch(Objects::nonNull)) {
            System.out.println("Present and correct");
        }
    }

    public void hamcrestMatchersSupported() {
        Optional<String> foo = getAnOptional();

        assertThat(foo.isPresent(), is(true));
        assertThat(foo.get(), is(42)); // INSPECTION: 'Optional.get()' without 'isPresent()' check
    }

    public void test() {
        String[] things = retrieveThings();
        assertThat(things, is(Matchers.arrayWithSize(1)));
        assertThat(things[0], is(equalTo("...")));
    }

    @Nullable
    private static String[] retrieveThings() {
        return new String[]{"..."};
    }

    private Optional<String> getAnOptional() {
        return Optional.empty();
    }

    List<Object> noFalsePositiveAfterIsAssignableFrom(Object value) {
        if (value instanceof List) {
            //do something
        }
        if (Object[].class.isAssignableFrom(value.getClass())) {
            return Arrays.asList((Object[]) value);//warning on cast to Object[]; removing if above, removes the warning
        }
        return null;
    }

    public <T> void newWarningsForIsInstance(@NotNull String property, @NotNull Class<T> clazz) {
        assert clazz == String.class || clazz == Integer.class || clazz == Boolean.class;
        Value value = getValue(property);

        if (clazz.isInstance(value)) {
            // new warning: always false as we know that clazz is String/Integer/Boolean which is never Value
        }
    }

    private Value getValue(String property) {
        return null;
    }

    private class Value {
    }
    //</editor-fold>

    private void automaticallyRemoveDoubleNegation(Foo x) {
        if (!(x instanceof Foo)) {
            return;
        }
        System.out.println(x);
    }

    interface Foo {}

    private void constantEvaluationOfSimpleMethods() {
        String foo = "foo";
        String bar = "bar";

        boolean startsWith = foo.startsWith(bar);
        boolean contains = foo.contains(bar);

        String o = "o";
        boolean lastIndexOf = foo.lastIndexOf(o) == 0;
        //String: contains, indexOf, startsWith, endsWith, lastIndexOf, length, trim, substring, equals, equalsIgnoreCase, charAt, codePointAt, compareTo, replace, valueOf

        int four = 4;
        boolean sqrt = Math.sqrt(four) == 1;
        //Math: abs, sqrt, min, max

    }
}
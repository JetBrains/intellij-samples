package com.jetbrains.inspections;

import org.hamcrest.Matchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SuppressWarnings("StatementWithEmptyBody")
public class DataFlowAnalysisTest {

    @Test
    public void shouldShowDataFlowWithInstanceOfExample(Object a) {
        if (a instanceof String || a instanceof Number) {
            System.out.println("String or Number");
        } else if (a instanceof CharSequence) {
            System.out.println("CharSequence");
        } else {

        }
    }


    @Test
    public void shouldShowDataFlowWithOptionalExample(Optional<String> optional) {
        if (optional.isPresent()) {

        }
    }


    @Test
    public void shouldShowDataFlowWithNumericExample(int x) {
        if (x > 100) {
            return;
        } else if (x < -10) {
            throw new IllegalArgumentException("Number too low");
        }


    }

    //NOT IN THIS VERSION
    public List<String> returnsImmutableResult() {
        return List.of("one", "two");
    }

    @Test
    public void shouldKnowAboutEmptyArrayLists() {
        ArrayList<String> strings = new ArrayList<>();

        String s = strings.get(1);
    }

    private void shouldUnrollStreamOf() {
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

    @Test
    public void hamcrestMatchersSupported() {
        Optional<String> foo = getAnOptional();

        assertThat(foo.isPresent(), is(true));
        assertThat(foo.get(), is(42)); // INSPECTION: 'Optional.get()' without 'isPresent()' check
    }

    @Test
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

    private void automaticallyRemoveDoubleNegation(Object x) {
        if (!(x instanceof Foo)) {
            return;
        }
    }

    private class Foo {
    }
}
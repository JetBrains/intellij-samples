package com.jetbrains.inspections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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

    private Optional<String> getAnOptional() {
        return Optional.empty();
    }
}

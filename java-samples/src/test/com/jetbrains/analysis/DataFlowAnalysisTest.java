package com.jetbrains.analysis;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DataFlowAnalysisTest {
    @Test
    public void shouldShowDataFlowAnalysisHints() {
        showTrueWhenLengthIsGreaterThanFour("12345");
        showTrueWhenLengthIsGreaterThanFour("1234");
    }

    private void showTrueWhenLengthIsGreaterThanFour(String string) {
        // breakpoint here
        var output = 1;
        // in 2020.1 and above, the line below will show a "true" of "false" hint when debugging
        if (string.length() > 4) {
            output++;
        }
        System.out.println(output);
    }

    @Test
    public void hamcrestMatchersShouldSupportOptional() {
        final Optional<String> foo = getAnOptional();

        assertThat(foo.isPresent(), is(true));
        assertThat(foo.get(), is("String")); // INSPECTION: 'Optional.get()' without 'isPresent()' check
    }

    private Optional<String> getAnOptional() {
        return Optional.of("String");
    }


}
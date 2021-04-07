package com.jetbrains.analysis;

import org.junit.jupiter.api.Test;

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
}
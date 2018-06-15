package com.jetbrains.inspections;

import org.junit.Test;

import java.util.Optional;

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
}

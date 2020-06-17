package com.jetbrains.navigation;

import com.jetbrains.entity.Customer;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ExceptionStackTraceTest {

    @Test
    @Disabled
    public void shouldNavigateToCorrectPositionInLineFromStackTrace() {
        Customer customer = new Customer("Alex", "B");

        assertThat(customer.firstName(), is("Sam"));
    }
}
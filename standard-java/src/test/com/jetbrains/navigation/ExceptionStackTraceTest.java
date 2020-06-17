package com.jetbrains.navigation;

import com.jetbrains.entity.Customer;
import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

public class ExceptionStackTraceTest {

    @Test
    @Disabled
    public void shouldNavigateToCorrectPositionInLineFromStackTrace() {
        Customer customer = new Customer("Alex", "B");

        Assert.assertThat(customer.firstName(), is("Sam"));
    }
}
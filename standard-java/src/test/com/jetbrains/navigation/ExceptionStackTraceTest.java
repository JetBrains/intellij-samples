package com.jetbrains.navigation;

import com.jetbrains.entity.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

import static org.hamcrest.CoreMatchers.is;

public class ExceptionStackTraceTest {

    @Test
    @Ignore
    public void shouldNavigateToCorrectPositionInLineFromStackTrace() {
        Customer customer = new Customer("Alex", "B");

        Assert.assertThat(customer.firstName(), is("Sam"));
    }
}
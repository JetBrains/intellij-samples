package com.jetbrains.navigation;

import com.jetbrains.persistence.models.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

import static org.hamcrest.CoreMatchers.is;

public class ExceptionStackTraceTest {

    @Test
    @Ignore
    public void shouldNavigateToCorrectPositionInLineFromStackTrace() {
        Customer customer = new Customer();

        Assert.assertThat(customer.getFirstName(), is("Sam"));
    }
}
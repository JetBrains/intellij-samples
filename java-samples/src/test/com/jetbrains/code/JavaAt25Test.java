package com.jetbrains.code;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class JavaAt25Test {
    @Test
    public void shouldReachInnerClass() {
        var myInnerClass = new JavaAt25.MyInnerClass();
    }

    @Test
    @Disabled
    public void shouldFail() {
        System.out.println(getEmailAddress().toString());

    }

    private String getEmailAddress() {
        return null;
    }

}
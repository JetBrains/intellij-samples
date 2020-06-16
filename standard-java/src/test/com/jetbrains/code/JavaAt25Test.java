package com.jetbrains.code;

import org.junit.Test;
import org.junit.Ignore;

public class JavaAt25Test {
    @Test
    public void shouldReachInnerClass() {
        var myInnerClass = new JavaAt25.MyInnerClass();
    }

    @Test
    @Ignore
    public void shouldFail() {
        System.out.println(getEmailAddress().toString());

    }

    private String getEmailAddress() {
        return null;
    }

}
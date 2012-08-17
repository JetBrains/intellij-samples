package com.example.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    private MyClass myClass;

    @Before
    public void setUp() throws Exception {
        myClass = new MyClass();
    }

    @Test
    public void testSayHello() throws Exception {
        assertEquals("Hello", myClass.sayHello());
    }
}

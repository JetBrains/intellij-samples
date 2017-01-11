package com.jetbrains.inspections;

import org.junit.Test;

public class UnusedCodeTest {
    @Test
    public void shouldCallTheMethod() {
        new UnusedCode().methodOnlyUsedByTests();
    }

}
package com.jetbrains.inspections;

import org.junit.jupiter.api.Test;

public class UnusedCodeTest {
    @Test
    public void shouldCallTheMethod() {
        new UnusedCode().methodOnlyUsedByTests();
    }

}
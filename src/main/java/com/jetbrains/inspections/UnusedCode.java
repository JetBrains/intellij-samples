package com.jetbrains.inspections;

@SuppressWarnings("WeakerAccess")
public class UnusedCode {
    public void methodOnlyUsedByTests() {
        System.out.println("This is only called by a test");
    }
}

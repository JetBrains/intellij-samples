package com.jetbrains.refactoring;

@SuppressWarnings({"unused", "UnusedReturnValue"})
public class MethodRefactoring {
    public Object myMethod(String name, int value, double price) {
        return null;
    }

    private void methodUsesOtherMethod() {
        Object retVal = myMethod("name", 1, 2.0);
    }
}

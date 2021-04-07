package com.jetbrains.problems;

@SuppressWarnings("unused")
public class CallingClass {
    private final ClassToChange value;

    public CallingClass() {
        value = new ClassToChange();
    }

    public ClassToChange getValue() {
        return value;
    }
}

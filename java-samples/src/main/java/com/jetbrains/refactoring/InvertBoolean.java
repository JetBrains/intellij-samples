package com.jetbrains.refactoring;

@SuppressWarnings("unused")
public class InvertBoolean {
    private final boolean isValid = false;

    public void usingBooleans() {
        if (!isValid) {
            System.out.println("Input is NOT valid");
        } else {
            System.out.println("All good");
        }
    }
}

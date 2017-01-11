package com.jetbrains.refactoring;


public class MakeStatic {
    private String s;
    private int i;

    /**
     * Apply "Make static" refactoring.
     */
    public void printMe() {
        for (int j = 0; j < i; j++) {
            System.out.println(s);
        }
    }
}

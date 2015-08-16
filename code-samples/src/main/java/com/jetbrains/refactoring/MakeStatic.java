package com.jetbrains.refactoring;

/**
 * Created by breandan on 2/9/2015.
 */
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

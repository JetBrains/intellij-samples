package com.jetbrains.debugging;

public class SetBreakpointFromStackTrace {
    // run this to see a "Create Breakpoint" hint in the stace trace in the run window
    public static void main(String[] args) {
        shouldThrowClassCastException();
    }

    //This is supposed to error
    private static void shouldThrowClassCastException() {
        int value = (int) getAString();
        System.out.println("value = " + value);
    }

    //<editor-fold desc="Helper methods">
    private static Object getAString() {
        return "a string";
    }
    //</editor-fold>
}

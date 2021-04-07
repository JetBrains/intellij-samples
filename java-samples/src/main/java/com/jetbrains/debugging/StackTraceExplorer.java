package com.jetbrains.debugging;

@SuppressWarnings("SameParameterValue")
public class StackTraceExplorer {

    public static void main(String[] args) {
        executeMethod(10);
    }

    private static void executeMethod(int i) {
        executeAnotherMethod(30);
    }

    private static void executeAnotherMethod(int i) {
        throw new IllegalArgumentException("Oh dear");
    }
}

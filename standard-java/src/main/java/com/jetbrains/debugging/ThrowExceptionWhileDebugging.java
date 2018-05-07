package com.jetbrains.debugging;

public class ThrowExceptionWhileDebugging {
    public static void main(String[] args) {
        new ThrowExceptionWhileDebugging().handleExceptions();
    }

    private void handleExceptions() {
        try {
            // breakpoint here
            System.out.println("Doing something here");
        } catch (IllegalArgumentException e) {
            System.out.printf("Handling IllegalArgumentException: %s%n", e.getMessage());
        } catch (RuntimeException e) {
            System.out.printf("Handling RuntimeException: %s", e.getMessage());
        }
    }


}

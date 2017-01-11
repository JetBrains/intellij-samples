package com.jetbrains.refactoring;

public class Strings {

    public void stringRefactoring() {

        // Partial selection Alt+Cmd+V changes behavior

        String message = "Extract this string " + 10 + " and number";


        // Compute value 100 * 4
        String message2 = String.format("This is a value %d", 100*4);

    }
}

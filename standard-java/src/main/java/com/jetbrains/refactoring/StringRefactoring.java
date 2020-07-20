package com.jetbrains.refactoring;

@SuppressWarnings("unused")
public class StringRefactoring {

    private void selectPartOfAStringAndExtractVariable() {
        // Partial selection Alt+Cmd+V changes behavior
        String message = "Extract this string " + 10 + " and number";
    }

    private void replaceCalculationWithResult() {
        // Alt + Enter on 100 * 4
        String message2 = String.format("This is a value %d", 100*4);
    }
}

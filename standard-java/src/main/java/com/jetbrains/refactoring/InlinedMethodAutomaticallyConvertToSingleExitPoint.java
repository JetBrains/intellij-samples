package com.jetbrains.refactoring;

@SuppressWarnings("unused")
public class InlinedMethodAutomaticallyConvertToSingleExitPoint {
    private String methodToInline(int colourIndex) {
        if (colourIndex == 1) {
            return "Red";
        }
        return "Blue";
    }

    //inline methodToInline
    private void printColourName(int colourIndex) {
        String value = methodToInline(colourIndex);
        System.out.println(value);
    }

}

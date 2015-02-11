package com.jetbrains.refactoring;

/**
 * Created by breandan on 2/9/2015.
 */
public class ExtractDelegate {
    public static void main(String[] args) {
        String s = "How to extract a delegate: ";

        String hotkey = "unknown";

        String[] steps = new String[5];
        steps[0] = "First select a block of code";
        steps[1] = "Then press " + hotkey;
        steps[2] = "Give the method a name";
        steps[3] = "Assign it a visibility";
        steps[4] = "Apply the refactoring";

        System.out.println(s);

        //Extract this loop
        for(String step : steps) {
            System.out.println(step);
        }
    }
}

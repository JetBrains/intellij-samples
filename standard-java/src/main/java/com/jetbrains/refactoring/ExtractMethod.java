package com.jetbrains.refactoring;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ExtractMethod {
    void main() {
        System.out.println("How to extract a method: ");

        String hotkey = "Ctrl/Cmd+Alt+M";

        List<String> steps = new ArrayList<>();
        steps.add("First select a block of code");
        steps.add("Then press " + hotkey);
        steps.add("Give the method a name");
        steps.add("Assign it a visibility");
        steps.add("Apply the refactoring");

        //Extract this loop
        for (String step : steps) {
            System.out.println(step);
        }
    }

    public void printList(List<String> values) {
        for (String value : values) {
            System.out.println(value);
        }
    }
}

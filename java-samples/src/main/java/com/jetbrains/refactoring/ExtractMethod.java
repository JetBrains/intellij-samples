package com.jetbrains.refactoring;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ExtractMethod {
    void main() {
        // Find Action - ⌘⇧A (macOS) or Ctrl+Shift+A (Windows/Linux)
        // 1. Use Find Action to extract a method
        // Take note of the shortcut displayed next to the action
        // 2. Use Find Action to show the navigation bar
        // 3. Use Find Action to paste from history
        // 4. And much more!

        System.out.println("How to extract a method: ");

        String hotkey = "Ctrl/Cmd+Alt+M";

        List<String> steps = new ArrayList<>();
        steps.add("First select a block of code");
        steps.add("Then press " + hotkey);
        steps.add("Give the method a name");
        steps.add("Assign it a visibility");
        steps.add("Apply the refactoring");

        printSteps(steps);
    }

    private void printSteps(List<String> steps) {
        for (String step : steps) {
            System.out.println(step);
        }
    }
}

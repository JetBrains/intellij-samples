package com.jetbrains.debugging;

import static java.lang.Math.random;
import static java.lang.System.out;
import static java.util.stream.IntStream.range;

public class SingleLineLambda {
    public static void main(String[] args) {
        // Use ⇧⌃P (macOS), or Shift+Ctrl+P (Windows/Linux) to:
        // Find type of random()
        // Find type of random() < 0.2
        // Find type of i > random() < 0.2
        // Find type of range (-127, 128)

        out.println(range(-128, 127)
                            .filter(i -> random() < 0.2)
                            .average());
    }
}
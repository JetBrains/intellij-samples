package com.jetbrains.debugging;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static java.lang.Math.random;
import static java.lang.System.out;
import static java.util.stream.IntStream.range;

public class SingleLineLambda {
    public static void main(String[] args) {
        OptionalDouble od =
                range(-128, 127)
                .filter(i -> random() < 0.5)
                .average();

        out.println(od.getAsDouble());

        out.println(range(-128, 127).filter(i -> random() < 0.2).average());
    }
}

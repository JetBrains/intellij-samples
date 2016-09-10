package com.jetbrains.debugging;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Created by breandan on 4/27/2015.
 */
public class SingleLineLambda {
    public static void main(String[] args) {
        OptionalDouble od = IntStream
                .range(-128, 127)
                .filter(i -> Math.random() < 0.5)
                .average();

        System.out.println(od.getAsDouble());

        System.out.println(IntStream.range(-128, 127).filter( i -> Math.random() < 0.2).average());
    }
}

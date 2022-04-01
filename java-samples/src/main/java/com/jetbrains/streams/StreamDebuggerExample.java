package com.jetbrains.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamDebuggerExample {
    private static IntStream factorize(int value) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= value; i++) {
            while (value % i == 0) {
                factors.add(i);
                value /= i;
            }
        }
        return factors.stream()
                      .mapToInt(Integer::intValue);
    }

    public static void main(String[] args) {

        // Debug Streams
        // 1. Set a breakpoint - Ctrl + F8 (⌘ F8), or click in gutter area (line 30)
        // 2. Start application in debug mode (debug main method from gutter icon)
        // 3. Click on 'Trace Current Stream Chain'

        int[] result = IntStream.of(10, 87, 97, 43, 121, 20)
                                .flatMap(StreamDebuggerExample::factorize)
                                .distinct()
                                .sorted()
                                .toArray();
        System.out.println(Arrays.toString(result));
    }
}

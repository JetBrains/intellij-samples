package com.jetbrains.intentions;

import java.util.List;

import static java.lang.System.out;

@SuppressWarnings("unused")
public class Looping {

    private void reverseForLoop() {
        for (int i = 0; i < 10; i++) {
            out.println(i);
        }
    }

    private void replaceForWithWhile() {
        for (int i = 0; i < 10; i++) {
            out.println(i);
        }
    }

    private void unrollLoopOfIntValues() {
        int[] ints = {1, 2, 3};
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    private void unrollDecreasingLoops() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    // now (2020.2) uses dataflow analysis to get the loop size
    private void unrollList(List<String> list) {
        if (list.size() == 2) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }

    // can unroll and the collapse back into loop
    private void unrollValues() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public void collapseIntoLoop() {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

}

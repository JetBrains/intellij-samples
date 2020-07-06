package com.jetbrains.intentions;

import java.util.List;

@SuppressWarnings("unused")
public class Looping {

    private void unrollLoopOfIntValues() {
        int[] ints = {1, 2, 3};
        for (int anInt : ints) {
            System.out.println(anInt);
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
    private void unrollValues(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public void collapseIntoLoop () {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

}

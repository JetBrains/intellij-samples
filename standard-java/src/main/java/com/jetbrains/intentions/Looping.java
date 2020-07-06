package com.jetbrains.intentions;

@SuppressWarnings("unused")
public class Looping {

    private void unrollLoop() {
        int[] ints = {1, 2, 3};
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

}

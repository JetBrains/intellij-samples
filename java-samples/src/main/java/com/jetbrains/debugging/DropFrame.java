package com.jetbrains.debugging;

/**
 * Created by hadihariri on 10/09/16.
 */
public class DropFrame {


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            executeMethodA(i);
            executeMethodB(i);
        }
    }

    static void executeMethodB(int i) {
        int b = i + 20;
        executeMethodC(b);
    }

    private static void executeMethodC(int i) {
        int c = i - 39;
        executeMethodD(c);
    }

    private static void executeMethodD(int i) {
        int d = i + 10;
        System.out.println(d);
    }

    private static void executeMethodA(int i) {
        int a = i * 30;
        System.out.println(a);
    }
}

package com.jetbrains.editor;

public class HelloWorldRTL {
    public static void main(String[] args) {
        String[] greetings = {"שלום עולם!", "مرحبا بالعالم!", "Hello world!"};
        for (String s: greetings) {
            System.out.println("\n" + s);
            for (char c: s.toCharArray()) {
                System.out.print(c);
            }
        }
    }
}

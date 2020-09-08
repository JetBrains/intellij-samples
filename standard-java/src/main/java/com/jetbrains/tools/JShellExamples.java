package com.jetbrains.tools;

@SuppressWarnings("unused")
public class JShellExamples {
    public static void main(String[] args) {
        var name = "Trisha";
        int num = 42;
    }

    void printMagicValue() {
        System.out.println("Magic value = "+getMagicValue());
    }

    private String getMagicValue() {
        return "I'm magic";
    }
}

package com.jetbrains.tools;

public class IntelliJIDEA {
    private final static String description = "The Leading Java and Kotlin IDE";

    public static void main(String[] args) {
        var message = "There's so much more to do than simply say 'Hello World!'";
        System.out.println(message);

        var developer = new Developer(ProductivityLevel.HIGH);
        developer.developWithPleasure("Make it happen. With code.");
    }

    record Developer(ProductivityLevel level) {
        public void developWithPleasure(String message) {
            System.out.println(description);
        }
    }

    private enum ProductivityLevel {
        HIGH
    }
}


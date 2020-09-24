package com.jetbrains.tools;

public class IntelliJIDEA {
    private final static String description = "Java, JVM and polyglot IDE";

    public static void main(String[] args) {
        var message = "There's so much more to do than simply say 'Hello World!'";
        System.out.println(message);

        var developer = new Developer(ProductivityLevel.HIGH);
        developer.developWithPleasure("The Drive to Develop");
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


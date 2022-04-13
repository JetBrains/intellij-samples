package com.jetbrains.completion;

public class PostfixCompletion {
    private void Dog(String breed) {
        // 1. Use .var to define a variable
        final var poodle = "Poodle";

        // 2. Use .nn to add a 'not null' condition
        if (breed != null) {
            // 3. Use .soutv to output a variable value
            System.out.println("breed = " + breed);
        }

        // 4. Use .new to initialise a class
        // 5. Use .try to create a try-catch-block
        try {
            new CodeCompletion();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

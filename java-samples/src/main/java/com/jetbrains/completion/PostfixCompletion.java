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

        // 6. Use .cast to add a correctly-formed cast expression
        createAnimal(Dog.class);
    }

    private Animal createAnimal(Class<? extends Animal> dogClass) {
        return null;
    }

    private class Animal {
    }

    private class Dog extends Animal {
    }
}

package com.jetbrains.completion;

public class PostfixCompletion {

    private void newMethod(String something) {
        // 1. Use .var to define a variable
        String s = "new string";

        // 2. Use .nn to add 'not null' condition
        if (something != null) {

            // 3. Use .sout to output variable value
            System.out.println(something);
        }

        // 4. Use .new to initialise a class
        // 5. Use .try to create a try-catch-block
        try {
            new CodeCompletion();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 6. Create new postfix completion
        // Use search everywhere to find postfix and select "Postfix Completion" select + button then Java
    }
}

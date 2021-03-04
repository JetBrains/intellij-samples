package com.jetbrains.formatting;

import java.util.List;

@SuppressWarnings("unused")
public class CodeFormatting {
    public void forceIfStatementsToHaveBraces(int someValue) {
        if (someValue == 2)
            System.out.println(someValue);

        System.out.println("Value is not two");
    }

    public void horriblyFormattedMethod  (){
        System.out.println("First line");
            System.out.println("Second line");
          System.out.println("Third line");
        for (int i = 0; i < 3; i++)
        System.out.println("I have no idea where the indentation is supposed to be");
    }

    // Use Alt+Enter and select "Put parameters on separate lines"
    public void methodWithLotsOfParameters(int param1, String param2, long param3, List<String> param4) {
        // do some business logic here
    }
}

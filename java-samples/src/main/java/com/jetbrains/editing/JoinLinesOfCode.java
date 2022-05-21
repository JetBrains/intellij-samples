package com.jetbrains.editing;

@SuppressWarnings("unused")

// Join lines using ⌃⇧J (macOS) or Ctrl+Shift+J (Windows/Linux)
// to concatenate String values, combine if statements and more.

public class JoinLinesOfCode {
    // 1. Concatenate String values
    void joinStringValues() {
        String longValue = "Everyone is asking this question - probably using a different set or words - When should we go back to normal? I believe, we need to redefine what normal is";
        System.out.println(longValue.toUpperCase());
    }

    // 2. Combine if statements
    void joinIfStatement(int month, int years){
        if (month > 5 && years > 2017) {
            System.out.println("Month > 5 and year > 2017");
        }
    }

    // 3. Join declaration with assignment
    void joinDeclarationWithAssignment() {
        int xPoint = 20;
    }

    // 4. Chain method calls
    void chainMethodCall() {
        StringBuilder sb = new StringBuilder("Jan").append("Feb").append("Mar");
    }
}

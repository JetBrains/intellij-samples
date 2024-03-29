package com.jetbrains.refactoring;

public class ExtractVariable {
    AnotherClass anotherClass = new AnotherClass();

    // The Extract Variable refactoring wraps a selected expression into a variable.
    // It adds a new variable declaration and uses the expression as an initializer.
    //  Select an expression and press ⌥⌘V (on Mac) or Ctrl+Alt+V (on Windows/Linux).
    public void method() {
        int a = 1;
        int b = a + anotherClass.intValue();
        int c = b + anotherClass.intValue();
    }
}

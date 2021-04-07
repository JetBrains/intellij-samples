package com.jetbrains.refactoring;

@SuppressWarnings("unused")
public class ReplaceInheritance extends SuperClass {

    void currentClassMethod() {
        superClassMethod();
        System.out.println("Called a method on SuperClass");
    }

}

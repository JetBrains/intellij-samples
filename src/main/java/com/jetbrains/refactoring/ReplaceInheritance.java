package com.jetbrains.refactoring;

/**
 * Created by hadihariri on 09/09/16.
 */
public class ReplaceInheritance extends SuperClass {

    void currentClassMethod() {
        superClassMethod();
        System.out.println("Called a method on SuperClass");
    }

}

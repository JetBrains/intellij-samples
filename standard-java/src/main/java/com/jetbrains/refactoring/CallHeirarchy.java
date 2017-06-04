package com.jetbrains.refactoring;


public class CallHeirarchy {
    private void bar() {
        baz();
    }

    private void foo() {
        bar();
    }

    //Change signature
    private void baz() {
    }

}

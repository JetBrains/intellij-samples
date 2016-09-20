package com.jetbrains.refactoring;


public class CallHeirarchy {
    private void foo() { bar();}
    private void bar() { baz();}

    //Change signature
    private void baz() {}

}

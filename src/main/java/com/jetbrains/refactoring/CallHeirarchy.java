package com.jetbrains.refactoring;

/**
 * Created by breandan on 3/30/2015.
 */
public class CallHeirarchy {
    private void foo() { bar();}
    private void bar() { baz();}
    private void baz() {}
}

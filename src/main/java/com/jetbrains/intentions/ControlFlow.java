package com.jetbrains.intentions;

/**
 * Created by breandan on 2/13/2015.
 */
public class ControlFlow {
    public void mergeNestedIfs(boolean a, boolean b, int x) {
        if (a) {
            if (b) {
                x = 1;
            }
        }
    }

    public int mergeParallelIfs(int a, int b) {
        if (a == 0) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
        if (a == 0) {
            return a;
        } else {
            return b;
        }
    }
}

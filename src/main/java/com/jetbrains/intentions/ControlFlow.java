package com.jetbrains.intentions;

import static java.lang.System.out;

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
            out.println("1");
        } else {
            out.println("2");
        }
        if (a == 0) {
            return a;
        } else {
            return b;
        }
    }
}

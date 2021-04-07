package com.jetbrains.intentions;

import static java.lang.System.out;

@SuppressWarnings("unused")
public class ControlFlowIntentions {
    public int mergeNestedIfs(boolean a, boolean b, int x) {
        if (a) {
            if (b) {
                x = 1;
            }
        }
        return x;
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

package com.jetbrains.intentions;

import static java.lang.System.out;

public class LoopIntentions {
    public void reverseForLoop() {
        for (int i = 0; i < 10; i++) {
            out.println(i);
        }
    }

    public void replaceForWithWhile() {
        for (int i = 0; i < 10; i++) {
            out.println(i);
        }
    }
}

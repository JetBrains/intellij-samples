package com.jetbrains.intentions;

/**
 * Created by breandan on 2/13/2015.
 */
public class LoopIntentions {
    public void reverseForLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    
    public void replaceForWithWhile() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

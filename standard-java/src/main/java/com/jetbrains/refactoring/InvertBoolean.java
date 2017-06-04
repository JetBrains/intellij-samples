package com.jetbrains.refactoring;

/**
 * Created by hadihariri on 09/09/16.
 */
public class InvertBoolean {
    private boolean isValid = false;

    public void usingBooleans() {

        if (!isValid) {
            System.out.println("Something takes place here");
        } else {
            System.out.println("Something else takes place here");
        }
    }




}

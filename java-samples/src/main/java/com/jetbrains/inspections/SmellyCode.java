package com.jetbrains.inspections;

/**
 * Created by hadihariri on 09/09/16.
 */
public class SmellyCode {

    public void similarExceptionBlock() {
        try {
            System.out.println("Doing something else");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package com.jetbrains.refactoring;

/**
 * Created by breandan on 2/9/2015.
 */
public class ExtractFunctionalParameter {
    public static void main(String[] args) {
        String s = "d";
        int i = 0;

        //Extract functional parameter as BiFunction (Ctrl/Cmd+Alt+Shift+P)
        double d = stringToDouble(i + s);
    }
    
    public static double stringToDouble(String s) {
        return Double.valueOf(s);
    }
}

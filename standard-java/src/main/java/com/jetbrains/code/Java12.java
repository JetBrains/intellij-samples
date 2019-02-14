package com.jetbrains.code;

@SuppressWarnings("unused")
public class Java12 {


    private int replaceSimpleSwitch(String category) {
        int value;
        switch (category) {
            case "Low":
                value = 1;
                break;
            case "Medium":
                value = 2;
                break;
            case "High":
                value = 3;
                break;
            default:
                value = 0;
                break;
        }
        return value;
    }

}

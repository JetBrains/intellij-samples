package com.jetbrains.versioning;

/**
 * Created by breandan on 4/29/2015.
 */
public class MergeChanges {
    private int anInt;
    private double aDouble;
    private String string;
    private float aFloat;

    public MergeChanges(int anInt, String s) {
        aDouble = 1.0;
        this.anInt = anInt+1;
        this.aFloat = 2F;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string += string;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public int getAnInt() {
        return anInt--;
    }

    public void setAnInt(int anInt) {
        this.anInt += anInt;
    }
}

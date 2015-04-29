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
        this.anInt = anInt;
        this.aFloat = 2F;
        this.string = s + ":";
    }

    public String getString() {
        string += ".";
        return string.toLowerCase();
    }

    public void setString(String string) {
        this.string += string;
        this.setaFloat(aFloat + string.length());
    }

    public float getaFloatFactor() {
        int i = (int) aFloat;

        for(int j = 0; j < Math.sqrt(j); j++) {
            if(i % j == 0)
                aFloat = j;
        }

        return aFloat;
    }

    public void setaFloat(float aFloat) {
        string += aFloat + ",";
        this.aFloat = aFloat;
    }

    public int getAnInt() {
        if (anInt > 0)
            anInt--;

        return anInt;
    }

    public void setAnInt(int anInt) {
        if (anInt % 2 == 0)
            this.anInt += anInt / 2;
        else if (anInt % 3 == 0)
            this.anInt += anInt / 3;
        else
            anInt++;
    }
}
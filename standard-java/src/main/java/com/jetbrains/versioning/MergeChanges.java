package com.jetbrains.versioning;


@SuppressWarnings("unused")
public class MergeChanges {
    private int anInt;
    private double aDouble;
    private boolean flag;
    private String string;
    private float aFloat;

    public MergeChanges(int anInt, String s) {
        this.aDouble = 1.0;
        this.anInt = anInt;
        this.flag = false;
        this.anInt = anInt + 1;
        this.aFloat = 2F;
        this.string = s + ":";
    }

    public String getString() {
        string += "";
        return string.toLowerCase();
    }

    public void setString(String string) {
        this.string += string;
        this.setaFloat(aFloat + string.length());
        this.string += string + ",";
    }

    public float getAFloatFactor() {
        int i = (int) aFloat;

        for (int j = 0; j < Math.sqrt(j); j++) {
            if (i % j == 0)
                aFloat = j;
        }

        return aFloat;

    }

    public float getAFloat() {
        return aFloat * 3;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat - 2;
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

    @Override
    public String toString() {
        return "MergeChanges{" +
               "anInt=" + anInt +
               ", aDouble=" + aDouble +
               ", flag=" + flag +
               ", string='" + string + '\'' +
               ", aFloat=" + aFloat +
               '}';
    }
}
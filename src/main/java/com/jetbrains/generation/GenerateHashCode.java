package com.jetbrains.generation;

/**
 * Created by breandan on 3/24/2015.
 */
public class GenerateHashCode {
    private String string;
    private long aLong;
    private int anInt;
    private char aChar;
    private short aShort;
    private double aDouble;

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof GenerateHashCode)) return false;

        final GenerateHashCode that = (GenerateHashCode) o;

        if (aLong != that.aLong) return false;
        if (anInt != that.anInt) return false;
        if (aChar != that.aChar) return false;
        if (aShort != that.aShort) return false;
        if (Double.compare(that.aDouble, aDouble) != 0) return false;
        return !(string != null ? !string.equals(that.string) : that.string != null);

    }
}

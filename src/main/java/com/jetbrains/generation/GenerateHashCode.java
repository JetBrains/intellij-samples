package com.jetbrains.generation;

import static java.lang.Double.compare;
import static java.lang.Double.doubleToLongBits;

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
        if (compare(that.aDouble, aDouble) != 0) return false;
        return !(string != null ? !string.equals(that.string) : that.string != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = string != null ? string.hashCode() : 0;
        result = 31 * result + (int) (aLong ^ (aLong >>> 32));
        result = 31 * result + anInt;
        result = 31 * result + (int) aChar;
        result = 31 * result + (int) aShort;
        temp = doubleToLongBits(aDouble);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

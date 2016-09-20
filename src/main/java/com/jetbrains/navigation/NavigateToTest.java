package com.jetbrains.navigation;

import static java.lang.Double.doubleToLongBits;
import static java.lang.Double.longBitsToDouble;

public class NavigateToTest {
    //Navigate to corresponding test via Ctrl/Cmd+Shift+T
    public static double fastInvSqrt(double x) {
        double xhalf = 0.5d * x;
        long i = doubleToLongBits(x);
        i = 0x5fe6ec85e7de30daL - (i >> 1);
        x = longBitsToDouble(i);
        x = x * (1.5d - xhalf * x * x);
        return x;
    }
}
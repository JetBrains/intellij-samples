package com.jetbrains.testing;

public class WeatherCheck {
    public static boolean contains(String[] weatherCondition) {
        for (String w : weatherCondition)
            if ("rain".equalsIgnoreCase(w)) {
                return true;
            }
        return false;
    }
}

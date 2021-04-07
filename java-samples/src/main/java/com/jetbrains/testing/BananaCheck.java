package com.jetbrains.testing;

public class BananaCheck {

    public static boolean containsBananas(String[] shopping) {
        for (String s : shopping)
            if ("bananas".equalsIgnoreCase(s)) {
                return true;
            }
        return false;
    }
}

package com.jetbrains.refactoring;

import java.util.*;

public class RateProvider {
    private static RateProvider instance;

    public static RateProvider getInstance() {
        return instance;
    }

    public double getRate(String fromCurrency, String toCurrency) {
        return 1;
    }

    Java8 sampleApp = new Java8();
    {
        sampleApp.print(Arrays.asList(1d, 5d, 10d), "USD", "EUR", 10d);
    }
}
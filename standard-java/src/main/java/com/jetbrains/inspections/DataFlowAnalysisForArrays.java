package com.jetbrains.inspections;

public class DataFlowAnalysisForArrays {
    private static final int DAYS_IN_FEB_LEAP_YEAR = 29;
    private static final int[] DAYS_IN_MONTH =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // NOT AVAILABLE IN THIS VERSION
    private boolean validateMonth(CustomDate date) {
        if (date.getMonth() < 1 || date.getMonth() > 12) {
            return false;
        }
        if (date.getMonth() == 2 && isLeapYear(date)) {
            return date.getMonth() < DAYS_IN_FEB_LEAP_YEAR;
        }
        else {
            return date.getMonth() < DAYS_IN_MONTH[date.getMonth()];
        }
    }

    private boolean isLeapYear(CustomDate date) {
        return date.getYear() % 4 == 0;
    }

    private class CustomDate {
        private final int month;
        private final int year;

        private CustomDate(int month, int year) {
            this.month = month;
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }
    }
}

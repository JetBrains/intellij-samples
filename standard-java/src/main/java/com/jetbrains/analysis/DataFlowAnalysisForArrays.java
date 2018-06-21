package com.jetbrains.analysis;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
class DataFlowAnalysisForArrays {
    private static final int[] DAYS_IN_MONTH =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private boolean validateMonth(com.jetbrains.analysis.DataFlowAnalysisForArrays.CustomDate date) {
        if (date.getMonth() < 1 || date.getMonth() > 12) {
            return false;
        }
        if (date.getMonth() != 2) {
            return date.getDay() < DAYS_IN_MONTH[date.getMonth()];
        } else {
            if (isLeapYear(date)) {
                return date.getDay() < 29;
            } else {
                return date.getDay() < DAYS_IN_MONTH[date.getMonth()];
            }
        }
    }




    private boolean isLeapYear(@NotNull CustomDate date) {
        return date.getYear() % 4 == 0;
    }

    private static final class CustomDate {
        private final int month;
        private final int year;
        private final int day;

        CustomDate(int year, int month, int day) {
            this.month = month;
            this.year = year;
            this.day = day;
        }

        int getMonth() {
            return month;
        }

        int getYear() {
            return year;
        }

        public int getDay() {
            return day;
        }
    }
}

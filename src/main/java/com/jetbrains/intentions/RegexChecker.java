package com.jetbrains.intentions;

public class RegexChecker {
    public boolean verifyPhoneNumber(String number) {
        if (number != null) {
            //"Check RegExp" intention: matches("|...")
            return number.matches("[0-9]{3}\\-[0-9]{4}");
        }

        return false;
    }
}

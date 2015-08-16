package com.jetbrains.intentions;

/**
 * Created by breandan on 2/17/2015.
 */
public class RegexChecker {
    public boolean verifyPhoneNumber(String number) {
        if (number != null) {
            //"Check RegExp" intention: matches("|...")
            return number.matches("[0-9]{3}\\-[0-9]{4}");
        }
        
        return false;
    }
}

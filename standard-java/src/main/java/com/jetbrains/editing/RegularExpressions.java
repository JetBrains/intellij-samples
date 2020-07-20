package com.jetbrains.editing;

import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class RegularExpressions {

    public void regularExpressions() {
        String creditCard = "^4[0-9]{12}(?:[0-9]{3})?$";

        String grouping = "(?<test>Something \\k<";
    }

    public void removeRedundantEscapeFromRegex() {
        final Pattern pattern = Pattern.compile("[\\.]");
    }
}

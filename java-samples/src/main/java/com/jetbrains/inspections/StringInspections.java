package com.jetbrains.inspections;

import java.util.StringJoiner;

@SuppressWarnings("unused")
public class StringInspections {
    private void suggestsStringAppendForStringJoiner() {
        String s = new StringJoiner("")
                .add("a")
                .add("b")
                .toString();
    }

    public boolean suspiciousEqualsCallOnStringBuilder(CharSequence charSequence) {
        final StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.equals(charSequence);
    }

    public boolean suspiciousEqualsCallOnString(CharSequence charSequence) {
        return "Some String".equals(charSequence);
    }

}

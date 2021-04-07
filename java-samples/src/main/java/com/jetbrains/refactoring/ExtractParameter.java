package com.jetbrains.refactoring;

@SuppressWarnings("unused")
public class ExtractParameter {
    public void methodThatCallsExtractParameterMethod() {
        // IntelliJ IDEA will automatically change this when the extractParameter method is changed
        extractParameter("The String");
    }

    void extractParameter(String stringValue) {
        // Extract parameter: Ctrl+Alt+P/Cmd+Option+P on stringLength
        // Note that IntelliJ IDEA will automatically remove the now-redundant stringValue param
        int stringLength = stringValue.length();

        System.out.println(stringLength);
    }
}

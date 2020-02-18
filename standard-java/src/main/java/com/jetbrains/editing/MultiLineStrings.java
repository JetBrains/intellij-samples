package com.jetbrains.editing;

@SuppressWarnings("unused")
public class MultiLineStrings {

    public void multiLineStrings() {


        // Pressing Enter in String will auto-insert +
        // Ctrl+Shift+J will join lines
        String someText = "This code can be on a single line " +
                "or it can be on multiple lines " +
                "and you can type and hit Enter and get the + sign " +
                "inserted automatically";

    }
}

package com.jetbrains.formatting;

@SuppressWarnings("unused")


public class LanguageInjection {

    String json = """
            {
                 "name":"Batman",
                 "eye colour": "blue",
                 "height": 188
            }""";


    String html = "<h1>Everything is AWESOME!!!</h1><p>Probably the best track from The Lego movie.</p>";

    private boolean verifyPhoneNumber(String num) {
        return num.matches(("[0-9]{3}-[0-9]{4}"));
    }

}
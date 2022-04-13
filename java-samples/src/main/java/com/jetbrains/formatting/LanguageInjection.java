package com.jetbrains.formatting;

@SuppressWarnings("unused")
public class LanguageInjection {

    public static void main(String[] args) {
        String json = "{\\n" +
                      "  \"spaniel\": \"Tinker\",\n" +
                      "  \"labrador\": \"Star\",\n" +
                      "  \"poodle\": \"Hattie\",\n" +
                      "  \"dalmatian\": \"Bubble\",\n" +
                      "}\n";
    }

    private boolean verifyPhoneNumber(String num) {
        return num.matches("\\d{3}-\\d{4}");
    }
}
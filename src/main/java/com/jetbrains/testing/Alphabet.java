package com.jetbrains.testing;

public class Alphabet {
    public static int countVowels(String s) {
        return (int) s.toLowerCase().chars()
                .filter(Alphabet::isVowel).count();
    }

    private static boolean isVowel(int c) {
        if(c == 'a')
            return true;
        if(c == 'e')
            return true;
        if(c == 'i')
            return true;
        if(c == 'o')
            return true;
        if(c == 'u')
            return true;

        return false;
    }

    public static int countConsonants(String s) {
        return (int) s.toLowerCase().chars()
                .filter(Alphabet::isConsonant).count();
    }

    private static boolean isConsonant(int c) {
        if(c < 'a')
            return false;

        if('z' < c)
            return false;

        return !isVowel(c);
    }
}
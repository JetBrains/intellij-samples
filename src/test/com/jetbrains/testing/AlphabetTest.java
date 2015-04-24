package com.jetbrains.testing;

import org.junit.Test;

/**
 * Created by breandan on 4/21/2015.
 */
public class AlphabetTest {
    private String s = "supercalifragilisticexpialidocious";

    @Test
    public void testCountVowels() throws Exception {
        int vowels = Alphabet.countVowels(s);
    }

    @Test
    public void testCountConsonants() throws Exception {
        int consonants = Alphabet.countConsonants(s);
    }
}
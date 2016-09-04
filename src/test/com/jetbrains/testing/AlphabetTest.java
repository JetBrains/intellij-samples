package com.jetbrains.testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by breandan on 4/21/2015.
 */
public class AlphabetTest {
    private String s = "supercalifragilisticexpialidocious!~";

    @Test
    public void testCountVowels() throws Exception {
        int vowels = 16; // Uncomment - CFU Alphabet.countVowels(s);
        assertEquals(16, vowels);
    }

    @Test
    public void testCountConsonants() throws Exception {
        int consonants = 18; // Uncomment - CFU Alphabet.countConsonants(s);
        assertEquals(18, consonants);
    }
}
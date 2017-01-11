package com.jetbrains.testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AlphabetTest {
    private String s = "supercalifragilisticexpialidocious!~";

    @Test
    public void testCountVowels() throws Exception {
        int vowels = Alphabet.countVowels(s);
        assertEquals(16, vowels);
    }

    @Test
    public void testCountConsonants() throws Exception {
        int consonants = Alphabet.countConsonants(s);
        assertEquals(18, consonants);
    }
}
package com.jetbrains.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlphabetTest {
    private final String s = "supercalifragilisticexpialidocious!~";

    @Test
    public void testCountVowels() {
        int vowels = Alphabet.countVowels(s);
        assertEquals(16, vowels);
    }

    @Test
    public void testCountConsonants() {
        int consonants = Alphabet.countConsonants(s);
        assertEquals(18, consonants);
    }
}
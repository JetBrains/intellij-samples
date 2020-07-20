package com.jetbrains.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
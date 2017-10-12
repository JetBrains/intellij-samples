package com.jetbrains.testing;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserJUnit5Test {

    @ParameterizedTest
    @ValueSource(strings = {"This is a happy message",
            "This is a HAPPY message"})
    public void shouldAnalyseHappyMessages(String message) throws Exception {
        Mood actual = MoodAnalyser.analyseMood(message);

        assertEquals(Mood.SAD, actual);
    }

    @Test
    public void shouldAnalyseSadMessages() throws Exception {
        Mood actual = MoodAnalyser.analyseMood("This is a sad message");

        assertEquals(Mood.SAD, actual);
    }
}
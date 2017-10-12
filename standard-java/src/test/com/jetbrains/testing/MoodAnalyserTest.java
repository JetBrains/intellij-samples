package com.jetbrains.testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Optional;

import static org.junit.Assert.*;

public class MoodAnalyserTest {

    @Test
    public void shouldAnalyseHappyMessages() throws Exception {
        Mood actual = MoodAnalyser.analyseMood("This is a happy message");

        Assert.assertEquals(Mood.HAPPY, actual);
    }

    @Test
    public void shouldBeCaseInsensitive() throws Exception {
        Mood actual = MoodAnalyser.analyseMood("This is a HAPPY message");

        Assert.assertEquals(Mood.HAPPY, actual);
    }

    @Test
    public void shouldAnalyseSadMessages() throws Exception {
        Mood actual = MoodAnalyser.analyseMood("This is a sad message");

        Assert.assertEquals(Mood.SAD, actual);
    }
}
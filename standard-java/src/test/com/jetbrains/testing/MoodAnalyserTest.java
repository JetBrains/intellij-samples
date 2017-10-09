package com.jetbrains.testing;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {
  @Test
  public void shouldIdentifyHappyMessages() throws Exception {
    Mood actual = MoodAnalyser.analyseMood("This is happy");

    Assert.assertEquals(Mood.HAPPY, actual);
  }
}
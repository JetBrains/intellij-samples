package com.jetbrains.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WeatherCheckTest {
    @Test
    void shouldReturnTrueWhenListContainsRain() {
        String[] weatherTypes = {"sun", "wind", "mist", "rain"};
        Assertions.assertTrue(WeatherCheck.contains(weatherTypes));
    }
}
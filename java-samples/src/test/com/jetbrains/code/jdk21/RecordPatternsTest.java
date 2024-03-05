package com.jetbrains.code.jdk21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RecordPatternsTest {
    @Test
    @DisplayName("Should sum point values")
    void shouldSum() {
        // when
        int sum = RecordPatterns.sum(new Point(1, 2));

        // then
        Assertions.assertEquals(3, sum);
    }

    @Test
    @DisplayName("Should sum points with JDK21")
    void shouldSumPointsWithJdk21() {
        // when
        int sum = RecordPatterns.sumUpdated(new Point(1, 2));

        // then
        Assertions.assertEquals(3, sum);
    }

}
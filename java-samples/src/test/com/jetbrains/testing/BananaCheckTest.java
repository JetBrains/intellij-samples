package com.jetbrains.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BananaCheckTest {

    @Test
    void shouldReturnTrueWhenListContainsBananas() {
        String[] shopping = {"apples", "bananas", "oranges", "lemons"};
        Assertions.assertTrue(BananaCheck.containsBananas(shopping));
    }
}

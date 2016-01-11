package com.jetbrains.navigation;

import junit.framework.TestCase;

import java.math.BigDecimal;
import java.math.MathContext;

import static com.jetbrains.navigation.NavigateToTest.fastInvSqrt;

/**
 * Created by breandan on 4/21/2015.
 */
public class NavigateToTestTest extends TestCase {

    public void testFastInvSqrt() throws Exception {
        BigDecimal slow = new BigDecimal(1 / Math.sqrt(2));
        BigDecimal fast = new BigDecimal(fastInvSqrt(2));
        MathContext mc = new MathContext(3);

        assertEquals(slow.round(mc), fast.round(mc));
    }
}
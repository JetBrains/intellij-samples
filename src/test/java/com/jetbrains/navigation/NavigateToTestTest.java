package com.jetbrains.navigation;

import junit.framework.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static com.jetbrains.navigation.NavigateToTest.*;

/**
 * Created by breandan on 2/10/2015.
 */
public class NavigateToTestTest {
    @Test
    public void testFastInvSqrt() {
        BigDecimal slow = new BigDecimal(1 / Math.sqrt(2));
        BigDecimal fast = new BigDecimal(fastInvSqrt(2));
        MathContext mc = new MathContext(3);
        
        Assert.assertEquals(slow.round(mc), fast.round(mc));
    }
}

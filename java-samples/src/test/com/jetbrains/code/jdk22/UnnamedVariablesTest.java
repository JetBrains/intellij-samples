package com.jetbrains.code.jdk22;

import com.jetbrains.entity.Order;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class UnnamedVariablesTest {
    @Test
    @DisplayName("Should stop the UnnamedVariablesClassBeingUnused")
    void shouldStopTheUnnamedVariablesClassBeingUnused() {
        UnnamedVariables.demoUseOfUnderscore();
        int i = UnnamedVariables.demoUseOfUnderscoreInException("Some string");
        int i2 = UnnamedVariables.demoUseOfUnderscoreInException("9");
        int i1 = UnnamedVariables.suggestReplacingUnusedVariableWithUnderscore(List.of(new Order(null, Order.State.DELIVERED)));
    }

}
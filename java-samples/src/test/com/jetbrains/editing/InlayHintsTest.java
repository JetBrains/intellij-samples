package com.jetbrains.editing;

import com.jetbrains.entity.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InlayHintsTest {
    @Test
    void creatingCallsToIncrementUsagesCodeVisionHints() {
        InlayHints inlayHints = new InlayHints();
        inlayHints.inlayHintsForChainedMethods();
        inlayHints.inlayHintsForChainedMethods();

        inlayHints.inlayHintsShownForImplicitTypes();

        var name = inlayHints.inlayHintsShownForParameterNames("customer 1");
        System.out.println(name);
        name = inlayHints.inlayHintsShownForParameterNames("customer 2");
        System.out.println(name);
        name = inlayHints.inlayHintsShownForParameterNames("customer 3");
        System.out.println(name);
    }
}
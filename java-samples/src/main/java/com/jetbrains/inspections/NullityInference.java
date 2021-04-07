package com.jetbrains.inspections;

import com.jetbrains.CallMe;


@SuppressWarnings("unused")
public class NullityInference {
    public void testAnnotationInference(Object nullityUnknown) {
        if (CallMe.neverReturnsNull() == null) {
            //Condition 'CallMe.neverReturnsNull() == null' is always 'false'.
        }

        if (CallMe.alwaysReturnsSame(new Object()) == null) {
            //Condition 'CallMe.alwaysReturnsSame(new Object()) == null' is always 'false'.
        }

        if (CallMe.alwaysReturnsSame(null) == null) {
            //Condition 'CallMe.alwaysReturnsSame(new Object()) == null' is always 'true'.
        }

        if (!CallMe.isNull(nullityUnknown)) {
            System.out.println(nullityUnknown.toString());
            return;
        }

        System.out.println(nullityUnknown.toString());
        //Method invocation 'nullityUnknown.toString()' may produce 'java.lang.NullPointerException'

        System.out.println(nullityUnknown.toString());

        //These do not seem to work correctly:
        System.out.println(CallMe.alwaysReturnsNull().toString());
        System.out.println(CallMe.sometimesReturnsNull().toString());

        CallMe.alwaysExpectsNull(null);
        CallMe.neverExpectsNull(null);
        //Passing 'null' argument to parameter annotated as @NotNull (never explicitly annotated)
    }
}

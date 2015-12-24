package com.jetbrains.refactoring;

import java.lang.reflect.Parameter;

/**
 * Created by breandan on 2/9/2015.
 */
public class ExtractParameter {
    public void extractParameter(Parameter p) {
        //Extract parameter via Ctrl/Cmd+Alt+P
        Parameter parameter = getClass().getEnclosingMethod().getParameters()[0];

        System.out.println(parameter.getName());
    }
}

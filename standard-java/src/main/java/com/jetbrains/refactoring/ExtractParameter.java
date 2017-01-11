package com.jetbrains.refactoring;

import java.lang.reflect.Parameter;


public class ExtractParameter {
    public void extractParameter(Parameter p) {
        //Extract parameter via Ctrl/Cmd+Alt+P
        Parameter parameter = getClass().getEnclosingMethod().getParameters()[0];

        System.out.println(parameter.getName());
    }
}

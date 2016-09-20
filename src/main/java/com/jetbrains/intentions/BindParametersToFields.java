package com.jetbrains.intentions;

public class BindParametersToFields {
    //Place cursor over parameter names
    public BindParametersToFields(byte b
            , short s
            , int i
            , long l) {
        String st = b + s + i + l + "";
    }

    public void bindMethodParametersToFields(float f
            , double d
            , char c) {
        String st = f + d + c + "";
    }
}

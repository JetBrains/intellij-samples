package com.jetbrains.inspections;

@SuppressWarnings("unused")
public class DuplicateCodeInspection {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg).append(", ");
        }

        System.out.println(sb);
    }

    // Note that if variable names are different it still counts as duplicate code
    public StringBuilder duplicate(String[] params) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String param : params) {
            stringBuilder.append(param).append(", ");
        }

        return stringBuilder;
    }
}

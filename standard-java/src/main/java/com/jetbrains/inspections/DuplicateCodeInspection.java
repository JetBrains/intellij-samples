package com.jetbrains.inspections;

import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("unused")
public class DuplicateCodeInspection {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String arg : args) {
            stringBuilder.append(arg).append(", ");
        }

        try {
            FileWriter fw = new FileWriter("temp");
            fw.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Note that if variable names are different it still counts as duplicate code
    public void duplicate(String[] params) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String param : params) {
            stringBuilder.append(param).append(", ");
        }

        try {
            FileWriter writer = new FileWriter("temp");
            writer.write(stringBuilder.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

package com.jetbrains.inspections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by hadihariri on 09/09/16.
 */
public class StructuralSearchReplace {

    public void emptyTryCatchBlock() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("input"));
        try {
            reader.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

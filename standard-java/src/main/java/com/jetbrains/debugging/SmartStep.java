package com.jetbrains.debugging;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by hadihariri on 10/09/16.
 */
public class SmartStep {


    public static void main(String[] args) throws IOException {

        System.out.println("You can smart step into a specific call on the line below");
        BufferedReader reader = new BufferedReader(new FileReader("README.md"));

        try {
            String data = reader.readLine();
            System.out.println(data);
        } finally {
            reader.close();
        }


    }
}

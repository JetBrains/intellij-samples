package com.jetbrains.intentions;

import sun.rmi.transport.Connection;

import java.io.*;

public class ExceptionIntentions {

    public void splitMergeCollapse(final File f1, final File f2) {
        //Replace 'try-with-resources' with 'try-finally'
        try (FileInputStream fis = new FileInputStream(f1);
             //Split 'try' statement with multuple resources
             FileOutputStream fos = new FileOutputStream(f2)) {
            fis.close();
            fos.close();
        }
        //Replace 'catch' with 'throws'
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Collapse 'catch' blocks
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

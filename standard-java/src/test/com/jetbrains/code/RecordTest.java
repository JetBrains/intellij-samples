package com.jetbrains.code;

import org.junit.Assert;
import org.junit.Test;

public class RecordTest {

    @Test
    public void showRecords() {
        Record trisha = new Record(23, "Trisha");
        System.out.println(trisha);
        Record mala = new Record(23, "Mala");

        Assert.assertNotEquals(trisha, mala);
        Record trisha2 = new Record(23, "Trisha");
        Assert.assertEquals(trisha, trisha2);
    }
}
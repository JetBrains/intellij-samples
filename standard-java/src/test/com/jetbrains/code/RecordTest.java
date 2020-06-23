package com.jetbrains.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RecordTest {

    @Test
    public void twoRecordsWithDifferentValuesAreNotEqual() {
        Record trisha = new Record(23, "Trisha");
        // note the "pretty" output
        System.out.println(trisha);
        Record mala = new Record(23, "Mala");
        assertNotEquals(trisha, mala);
    }

    @Test
    public void twoRecordsWithTheSameValuesAreEqual() {
        Record trisha = new Record(23, "Trisha");
        Record trisha2 = new Record(23, "Trisha");
        assertEquals(trisha, trisha2);
    }

    @Test
    public void gettersDoNotHaveGetInTheName() {
        Record trisha = new Record(23, "Trisha");

        // note that code completion suggests the property names
        assertEquals(23, trisha.id());
        assertEquals("Trisha", trisha.name());
    }
}
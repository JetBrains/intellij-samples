package com.jetbrains.code.jdk16;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonDTOTest {
    @Test
    @DisplayName("Should construct a simple person")
    void shouldConstructASimplePerson() {
        // given
        String firstName = "A";
        String lastName = "Person";
        LocalDate dateOfBirth = LocalDate.now();

        // when
        PersonDTO personDTO = new PersonDTO(firstName, lastName, dateOfBirth);

        //then
        assertEquals(firstName, personDTO.getFirstName());
        assertEquals(lastName, personDTO.getLastName());
        assertEquals(dateOfBirth, personDTO.getDateOfBirth());
    }

    @Test
    @DisplayName("Should have the expected toString")
    void shouldHaveTheExpectedToString() {
        // when
        PersonDTO personDTO = new PersonDTO("A", "Person", LocalDate.of(1980, 3, 20));

        // then
        assertEquals("PersonDTO{firstName='A', lastName='Person', dateOfBirth=1980-03-20}", personDTO.toString());
    }

    @Test
    @DisplayName("Should have the expected hashCode")
    void shouldHaveTheExpectedHashCode() {
        // when
        PersonDTO personDTO = new PersonDTO("A", "Person", LocalDate.of(1980, 3, 20));

        // then
        assertEquals(990329856, personDTO.hashCode());
    }

    @Test
    @DisplayName("Should be true that two person Objects with same values are equal")
    void shouldBeTrueThatTwoPersonObjectsWithSameValuesAreEqual() {
        // when
        PersonDTO person1 = new PersonDTO("A", "Person", LocalDate.of(1980, 3, 20));
        PersonDTO person2 = new PersonDTO("A", "Person", LocalDate.of(1980, 3, 20));

        // then
        assertEquals(person1, person2);
        assertEquals(person2, person1);
    }

}
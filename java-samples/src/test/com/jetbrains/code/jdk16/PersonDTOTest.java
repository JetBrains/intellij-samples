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
    @DisplayName("Should toString")
    void shouldToString() {
        // when
        PersonDTO personDTO = new PersonDTO("A", "Person", LocalDate.now());

        // then
        assertEquals("PersonDTO{firstName='A', lastName='Person', dateOfBirth=2021-03-11}", personDTO.toString());
    }

    @Test
    @DisplayName("Should hashCode")
    void shouldHashCode() {
        // when
        PersonDTO personDTO = new PersonDTO("A", "Person", LocalDate.now());

        // then
        assertEquals(990413815, personDTO.hashCode());
    }

    @Test
    @DisplayName("Should equals")
    void shouldEquals() {
        // when
        PersonDTO person1 = new PersonDTO("A", "Person", LocalDate.now());
        PersonDTO person2 = new PersonDTO("A", "Person", LocalDate.now());

        // then
        assertEquals(person1, person2);
        assertEquals(person2, person1);
    }

}
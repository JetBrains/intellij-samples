package com.jetbrains.code.jdk16;

import java.time.LocalDate;

@SuppressWarnings("unused")
// Can convert this to a record. Alt+Enter on class name
public class PersonDTO {
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;

    public PersonDTO(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + dateOfBirth.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonDTO personDTO = (PersonDTO) o;

        if (!firstName.equals(personDTO.firstName)) return false;
        if (!lastName.equals(personDTO.lastName)) return false;
        return dateOfBirth.equals(personDTO.dateOfBirth);
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", dateOfBirth=" + dateOfBirth +
               '}';
    }

}

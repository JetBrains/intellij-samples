package com.jetbrains.code;

import com.jetbrains.entity.Order;

import java.util.Collection;
import java.util.Objects;

@SuppressWarnings("unused")
public class RearrangeCode {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "RearrangeCode{" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", middleName='" + middleName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", phone='" + phone + '\'' +
               ", email='" + email + '\'' +
               ", notes='" + notes + '\'' +
               ", ordersById=" + ordersById +
               '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void privateHelperMethod() {
        // does something in here
    }

    private String middleName;

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String notes;

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RearrangeCode that = (RearrangeCode) o;
        return id == that.id &&
               Objects.equals(firstName, that.firstName) &&
               Objects.equals(middleName, that.middleName) &&
               Objects.equals(lastName, that.lastName) &&
               Objects.equals(phone, that.phone) &&
               Objects.equals(email, that.email) &&
               Objects.equals(notes, that.notes) &&
               Objects.equals(ordersById, that.ordersById);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, phone, email, notes, ordersById);
    }

    private Collection<Order> ordersById;

    public Collection<Order> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<Order> ordersById) {
        this.ordersById = ordersById;
    }
}

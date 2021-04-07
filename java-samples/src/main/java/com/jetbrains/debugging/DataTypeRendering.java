package com.jetbrains.debugging;

import com.jetbrains.entity.Customer;

public class DataTypeRendering {

    public static void main(String[] args) {
        CustomType customType = new CustomType("J", "Smith", "j.smith@nothing.com");

        System.out.println(customType.firstName());
    }

    private static class CustomType {
        private final String firstName;
        private final String lastName;
        private final String email;

        public CustomType(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public String firstName() {
            return firstName;
        }
    }
}

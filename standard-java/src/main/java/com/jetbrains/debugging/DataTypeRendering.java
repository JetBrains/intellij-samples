package com.jetbrains.debugging;

import com.jetbrains.entity.Customer;

public class DataTypeRendering {

    public static void main(String[] args) {

        Customer customer = new Customer("Pat", "Last-Name");

//        customer.setFirstName("Jane");
//        customer.setLastName("Smith");
//        customer.setEmail("jane.smith@gmail.com");

        System.out.println(customer.firstName());
    }

}

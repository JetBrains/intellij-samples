package com.jetbrains.debugging;

import com.jetbrains.persistence.models.Customer;

/**
 * Created by hadihariri on 10/09/16.
 */
public class DataTypeRendering {

    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.setFirstName("Jane");
        customer.setLastName("Smith");
        customer.setEmail("jane.smith@gmail.com");

        System.out.println(customer.getFirstName());
    }

}

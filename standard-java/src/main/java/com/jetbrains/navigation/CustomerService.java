package com.jetbrains.navigation;

import com.jetbrains.entity.Customer;

public class CustomerService {

    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void save(Customer customer) {
        customerRepository.save(customer);
    }
}
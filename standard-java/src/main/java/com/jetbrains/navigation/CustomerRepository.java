package com.jetbrains.navigation;

import com.jetbrains.persistence.models.Customer;

import java.util.List;

public interface CustomerRepository {
    void save(Customer customer);
    Customer getById(int id);
    List<Customer> getAll();
}

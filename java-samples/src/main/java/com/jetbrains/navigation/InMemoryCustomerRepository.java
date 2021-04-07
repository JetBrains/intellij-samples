package com.jetbrains.navigation;

import com.jetbrains.entity.Customer;

import java.util.List;

public class InMemoryCustomerRepository implements CustomerRepository {
    @Override
    public void save(Customer customer) {

    }

    @Override
    public Customer getById(int id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }
}

package com.jetbrains.navigation;

import com.jetbrains.entity.Customer;

import java.util.List;

public class MongoDBCustomerRepository implements CustomerRepository {
    @Override
    public void save(Customer customer) {
        // implementation details for MongoDB
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

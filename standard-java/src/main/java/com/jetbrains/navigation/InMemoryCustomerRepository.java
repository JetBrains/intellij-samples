package com.jetbrains.navigation;

import com.jetbrains.persistence.models.Customer;

import java.util.List;

/**
 * Created by hadihariri on 09/09/16.
 */
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

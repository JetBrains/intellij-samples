package com.jetbrains.navigation;

import com.jetbrains.persistience.models.Customer;

import java.util.List;

/**
 * Created by hadihariri on 09/09/16.
 */
public interface CustomerRepository {
    void save(Customer customer);
    Customer getById(int id);
    List<Customer> getAll();
}

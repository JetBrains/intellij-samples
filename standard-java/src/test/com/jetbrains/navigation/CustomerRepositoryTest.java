package com.jetbrains.navigation;

import com.jetbrains.persistence.models.Customer;
import org.junit.Test;

import java.util.List;

public class CustomerRepositoryTest {
    private final CustomerRepository repository;


    public CustomerRepositoryTest() {
        repository = new CustomerRepositoryStub();
    }

    @Test
    public void shouldSaveCustomer() {
        Customer customer = new Customer();
        repository.save(customer);

        //assert customer saved
    }

    private static class CustomerRepositoryStub implements CustomerRepository {
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
}
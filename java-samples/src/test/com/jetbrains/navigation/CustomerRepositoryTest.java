package com.jetbrains.navigation;

import com.jetbrains.entity.Customer;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class CustomerRepositoryTest {
    private final CustomerRepository repository;

    public CustomerRepositoryTest() {
        repository = new CustomerRepositoryStub();
    }

    @Test
    public void shouldSaveCustomer() {
        Customer customer = new Customer("First", "Last");
        repository.save(customer);

        //TODO: assert customer saved
    }


    @Disabled("Only to demo editor features")
    @Test
    @DisplayName("Should highlight spelling mistake")
    void shouldHighlightSpellingMistake() {
        Customer cusomer = new Customer("Frist", "Last");
        assertNotNull(cusomer);
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
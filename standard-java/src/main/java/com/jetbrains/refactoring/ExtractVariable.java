package com.jetbrains.refactoring;


import com.jetbrains.persistence.models.Customer;

import java.util.regex.Pattern;

@SuppressWarnings("unused")
class ExtractVariable {
    private final Order order = new Order();

    private final String fullName = order.getCustomer().getFirstName() +
                                    " " +
                                    order.getCustomer().getLastName();

    private int automaticallyConvertTernaryToIfStatementWhenNeeded(String message) {
        Pattern whitespace = Pattern.compile("\\s");
        return message != null ? whitespace.matcher(message).start() : -1;
    }

    // helper classes
    private class Order {
        private Customer customer = new Customer();

        public Customer getCustomer() {
            return customer;
        }
    }
}

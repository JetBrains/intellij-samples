package com.jetbrains.refactoring;

import com.jetbrains.entity.Customer;

import java.util.regex.Pattern;

@SuppressWarnings("unused")
class ExtractVariable {
    private final Order order = new Order();

    private final String fullName = order.getCustomer().firstName() +
                                    " " +
                                    order.getCustomer().lastName();

    private int automaticallyConvertTernaryToIfStatementWhenNeeded(String message) {
        Pattern whitespace = Pattern.compile("\\s");
        return message != null ? whitespace.matcher(message).start() : -1;
    }

    private void simpleExtractVariable() {
        System.out.println("Hello " + order.getCustomer().firstName());
    }

    //<editor-fold desc="Helper Classes">
    private class Order {
        private Customer customer = new Customer("Chris", "Last-Name");

        public Customer getCustomer() {
            return customer;
        }
    }
    //</editor-fold>
}

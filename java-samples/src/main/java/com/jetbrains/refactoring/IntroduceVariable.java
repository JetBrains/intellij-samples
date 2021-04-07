package com.jetbrains.refactoring;

import com.jetbrains.entity.Customer;

import java.util.List;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
class IntroduceVariable {
    private static final int MAX_LIMIT = 10;
    private final Order order = new Order();

    private final String fullName = order.getCustomer().firstName() +
                                    " " +
                                    order.getCustomer().lastName();

    private void simpleExtractVariable() {
        System.out.println("Hello " + order.getCustomer().firstName());
    }

    private void introduceVariableInABranch(List<Order> orders) {
        if (orders.size() < MAX_LIMIT) {
            if (isSpecialOccasion()) {
                sendLocalisedMessage("ALL_GOOD", orders.size());
                sendLocalisedMessage("ORDER_SIZE", orders.size());
            } else {
                sendLocalisedMessage("TOO_MANY", orders.size());
                sendLocalisedMessage("ORDER_SIZE", orders.size());
            }
        } else {
            sendLocalisedMessage("ALL_GOOD", orders.size());
            sendLocalisedMessage("ORDER_SIZE", orders.size());
        }
    }

    private int automaticallyConvertTernaryToIfStatementWhenNeeded(String message) {
        Pattern whitespace = Pattern.compile("\\s");
        return message != null ? whitespace.matcher(message).start() : -1;
    }

    //<editor-fold desc="Helper Classes and methods">
    private static class Order {
        private final Customer customer = new Customer("Chris", "Last-Name");
        public Customer getCustomer() {
            return customer;
        }

    }

    private void sendLocalisedMessage(String messageKey, int size) {
    }

    private boolean isSpecialOccasion() {
        return false;
    }
    //</editor-fold>
}

package com.jetbrains.code.jdk23;

@SuppressWarnings("unused")
public class PrimitiveTypesInSwitch {
    private void asIfStatements(Message x) {
        if (x.getStatus() == 0) {
            System.out.println("okay");
        } else if (x.getStatus() == 1) {
            System.out.println("warning");
        } else if (x.getStatus() == 2) {
            System.out.println("error");
        } else {
            System.out.println("unknown status: " + x.getStatus());
        }
    }

    private void asSwitch(Message x) {
        switch (x.getStatus()) {
            case 0 -> System.out.println("okay");
            case 1 -> System.out.println("warning");
            case 2 -> System.out.println("error");
            default -> System.out.println("unknown status: " + x.getStatus());
        }
    }

    private static class Message {
        private int status;

        public int getStatus() {
            return status;
        }
    }
}

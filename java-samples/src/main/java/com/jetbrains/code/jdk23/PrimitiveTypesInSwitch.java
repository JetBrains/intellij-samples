package com.jetbrains.code.jdk23;

public class PrimitiveTypesInSwitch {
    private void type(Message x) {
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

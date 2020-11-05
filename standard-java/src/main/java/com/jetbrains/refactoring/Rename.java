package com.jetbrains.refactoring;

public class Rename {
    @SuppressWarnings({"unused", "FieldCanBeLocal"})
    static class FlavourProvider {
        private final Flavour flavour;
        private Decorator decorator;

        public FlavourProvider(Flavour flavour) {
            this.flavour = flavour;
        }

        public void setDecorator(Decorator decorator) {
            this.decorator = decorator;
        }
    }

    enum Flavour {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        FlavourProvider primary = new FlavourProvider(Flavour.RED);
        FlavourProvider secondary = new FlavourProvider(Flavour.GREEN);
        FlavourProvider tertiary = new FlavourProvider(Flavour.BLUE);

        // Flavour RED needs to be labelled as some sort of red
        primary.setDecorator(new Decorator("red"));
        secondary.setDecorator(new Decorator("green"));
        tertiary.setDecorator(new Decorator("blue"));
    }

    private static record Decorator(String name) {
    }
}

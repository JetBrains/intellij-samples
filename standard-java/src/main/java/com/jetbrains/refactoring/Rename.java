package com.jetbrains.refactoring;

@SuppressWarnings("FieldCanBeLocal")
public class Rename {
    @SuppressWarnings("unused")
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

        primary.setDecorator(new Decorator("red"));
        secondary.setDecorator(new Decorator("green"));
        tertiary.setDecorator(new Decorator("blue"));
    }

    @SuppressWarnings({"FieldCanBeLocal", "unused"})
    private static class Decorator {
        private final String name;

        public Decorator(String name) {
            this.name = name;
        }
    }
}

package com.jetbrains.refactoring;

public class PlanetExtractions {

    Planet myPlanet = new Planet("earth");

    private void printPlanetFacts() {
        System.out.println("Planet name is " + myPlanet.getName());
        System.out.println("Current season is " + myPlanet.getCountryWeather());
        System.out.println("Number of times the planet rotates around the sun is " + 365);
        System.out.println("Number of characters in planet name = " + myPlanet.getName().length());

        switch (myPlanet.getCountryWeather()) {
            case "Spring" -> System.out.println("The weather is warm in the UK");
            case "Summer" -> System.out.println("The weather is hot in the UK");
            case "Autumn" -> System.out.println("The weather is cool in the UK");
            default -> System.out.println("The weather is cold in the UK");
        }
    }
}
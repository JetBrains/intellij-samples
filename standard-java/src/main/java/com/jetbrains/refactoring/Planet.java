package com.jetbrains.refactoring;

public class Planet {
    public String name;
    public String season;

    public Planet(String name) {
        this.name = name;
    }

    public String getCountryWeather() {
        return season;
    }

    public String getName() {
        return name;
    }
}

package com.xworkz.operation.name;

public class State {
    public String name;
    Long population;
   public City[] cities;

    public State(String name, Long population, City[] cities) {
        this.name = name;
        this.population = population;
        this.cities = cities;
    }
}
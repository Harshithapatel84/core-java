package com.xworkz.operation.name;

public class Country {
   public String name;
    President president;
    public State[] states;

    public Country(String name, President president, State[] states) {
        this.name = name;
        this.president = president;
        this.states = states;
    }

    public void display() {
        System.out.println("Country:"+name);

        if (president != null) {
            System.out.println("President:"+president.name);
        }

        if (states != null) {
            for (State state:states) {
                if (state != null) {
                    System.out.println("State:"+state.name);

                    if (state.cities != null) {
                        for (City city:state.cities) {
                            if (city != null) {
                                System.out.println("City:"+city.name);

                                if (city.districts != null) {
                                    for (District d:city.districts) {
                                        if (d != null) {
                                            System.out.println("District:"+d.name);

                                            if (d.collector != null) {
                                                System.out.println("Collector:"+d.collector.name);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

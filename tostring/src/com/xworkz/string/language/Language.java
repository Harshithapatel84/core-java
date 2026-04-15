package com.xworkz.string.language;

public class Language {
    String origin;
    String[] states;
    int noOfPeople;
    LanguageType type;
    Country country;

    public Language(String origin, String[] states, int noOfPeople, LanguageType type, Country country) {
        this.origin = origin;
        this.states = states;
        this.noOfPeople = noOfPeople;
        this.type = type;
        this.country = country;
    }

    void speak(){
        System.out.println("there are n number of languages");
    }
    void learn(){
        System.out.println("can learn multiple languages");
    }

    @Override
    public String toString() {
        return "origin=" + origin+",states="+states+",number of people:"+noOfPeople +",type:"+type+",country="+country;
    }
}

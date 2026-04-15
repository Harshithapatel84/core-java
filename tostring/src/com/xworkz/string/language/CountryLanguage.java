package com.xworkz.string.language;

public class CountryLanguage extends Language {

    String name;
    String presidentName;

    public CountryLanguage(String origin, String[] states, int noOfPeople,
                           LanguageType type, Country country,
                           String name, String presidentName) {

        super(origin, states, noOfPeople, type, country);
        this.name = name;
        this.presidentName = presidentName;
    }


    @Override
    void speak() {
        System.out.println("Country language is spoken here");
    }

    @Override
    void learn() {
        System.out.println("People learn this country language");
    }


    @Override
    public String toString() {
        return super.toString() +
                ", name="+name+ ",presidentName="+presidentName;
    }
}
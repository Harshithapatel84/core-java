package com.xworkz.country.runner;

import java.util.ArrayList;
import java.util.List;

public class CountryRunner {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<String>();
        countries.add("Australia");
        countries.add("India");
        countries.add("United Kingdom");
        countries.add("Malaysia");
        countries.add("Japan");
        countries.add("Russia");
        countries.add("usa");
        countries.add("Singapore");
        countries.add("Australia");
        countries.add("China");
        countries.add("Pakistan");

        countries.stream().filter(c->c.startsWith("I")).forEach(System.out::println);

        countries.stream().filter(c->c.endsWith("n")).forEach(System.out::println);

         countries.stream().filter(country->country.length()>10).forEach(System.out::println);

        countries.stream().filter(c->c.length()<5).forEach(System.out::println);

        for(String country:countries){
            System.out.println(country);
        }

    }

}

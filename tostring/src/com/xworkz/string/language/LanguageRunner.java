package com.xworkz.string.language;

import com.xworkz.string.slipper.Color;

public class LanguageRunner {
    public static void main(String[] args) {

        String[] states = {"karnataka", "Delhi", "Mumbai", "kerala"};

        LanguageType type = LanguageType.KANNADA;

        Country country = new Country("india");

        Language language = new Language("India", states, 600000000, type, country);

        language.speak();
        language.learn();
        System.out.println(language);

        CountryLanguage language1 = new CountryLanguage("USA", states, 5000000,
                type, country, "USA", "trump");
        System.out.println(language1);
    }
}

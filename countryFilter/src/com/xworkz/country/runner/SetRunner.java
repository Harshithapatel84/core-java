package com.xworkz.country.runner;

import com.xworkz.country.dto.CountryDTO;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

    public static void main(String[] args) {
        Set<String> runner=new HashSet<String>();
        runner.add("harshitha");
        runner.add("kiara");
        runner.add("siya");
        runner.add("riya");
        runner.add("rahul");
        runner.add("praveen");
        runner.add("siya");

        System.out.println("total size is:"+runner.size());
        runner.forEach(r-> System.out.println(r));

        Set<Number> numbers=new HashSet<>();
        numbers.add(56);
        numbers.add(67);
        numbers.add(68);
        numbers.add(96);
        numbers.add(34);
        numbers.add(67);

        numbers.forEach(System.out::println);

        Set<CountryDTO> countryDTOS=new TreeSet<>();
        countryDTOS.add(new CountryDTO("india",91,"draupadi murmu","narendra modi"));
        countryDTOS.add(new CountryDTO("United States", 1, "Donald Trump", "Donald Trump"));
        countryDTOS.add(new CountryDTO("United Kingdom", 44, "King Charles III", "Keir Starmer"));
        countryDTOS.add(new CountryDTO("Japan", 81, "Naruhito", "Shigeru Ishiba"));
        countryDTOS.add(new CountryDTO("Australia", 61, "Sam Mostyn", "Anthony Albanese"));
        System.out.println("total size:"+countryDTOS.size());
        countryDTOS.forEach(System.out::println);
        boolean present= countryDTOS.contains(new CountryDTO("Japan", 81, "Naruhito", "Shigeru Ishiba"));
        System.out.println("present:"+present);
        
    }
}

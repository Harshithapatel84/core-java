package com.xworkz.operation.runner;

import com.xworkz.operation.name.*;
import com.xworkz.operation.store.StoreCountryDetail;

public class CountryRunner {
    public static void main(String[] args) {
        Country[] countries=new Country[10];
        Collector collector=new Collector("Ravi",34);
        District district=new District("Bangalore urban",collector);
        District[] districts={district};

        City city =new City("bangalore",17,districts);
        City[] cities={city};

        State state= new State("karnataka",12000000L,cities);
        State[] states={state};

        Address address=new Address(60,560076,state);
        President president=new President("Drowpadi Murmu",56,address);

        StoreCountryDetail store=new StoreCountryDetail(countries);
        Country country1=new Country("india",president,states);
        store.save(country1);
        store.display();

        System.out.println("========================================================================");

        Collector collector2 = new Collector("amulya", 45);

        District district2 = new District("Zurich District", collector2);
        District[] districts2 = {district2};

        City city2 = new City("Zurich", 12, districts2);
        City[] cities2 = {city2};

        State state2 = new State("Zurich Canton", 1500000L, cities2);
        State[] states2 = {state2};

        Address address2 = new Address(20, 8000, state2);
        President president2 = new President("Alain Berset", 50, address2);

        Country country2 = new Country("Switzerland", president2, states2);
        store.save(country2);
        store.display();

        System.out.println("========================================================================");

        Collector collector3 = new Collector("akshay", 40);

        District district3 = new District("Moscow District", collector3);
        District[] districts3 = {district3};

        City city3 = new City("Moscow", 10, districts3);
        City[] cities3 = {city3};

        State state3 = new State("Moscow Oblast", 12000000L, cities3);
        State[] states3 = {state3};

        Address address3 = new Address(30, 101000, state3);
        President president3 = new President("Vladimir Putin", 70, address3);

        Country country3 = new Country("Russia", president3, states3);

        store.save(country3);
        store.display();

        System.out.println("========================================================================");

        Collector collector4 = new Collector("John", 50);

        District district4 = new District("California District", collector4);
        District[] districts4 = {district4};

        City city4 = new City("Los Angeles", 15, districts4);
        City[] cities4 = {city4};

        State state4 = new State("California", 39000000L, cities4);
        State[] states4 = {state4};

        Address address4 = new Address(40, 90001, state4);
        President president4 = new President("Joe Biden", 80, address4);

        Country country4 = new Country("USA", president4, states4);

        store.save(country4);
        store.display();

        System.out.println("========================================================================");

        Collector collector5 = new Collector("siddharth", 45);

        District district5 = new District("London District", collector5);
        District[] districts5 = {district5};

        City city5 = new City("London", 20, districts5);
        City[] cities5 = {city5};

        State state5 = new State("England", 56000000L, cities5);
        State[] states5 = {state5};

        Address address5 = new Address(50, 1000, state5);
        President president5 = new President("Rishi Sunak", 43, address5);

        Country country5 = new Country("UK", president5, states5);

        store.save(country5);
        store.display();

        System.out.println("========================================================================");

        Collector collector6 = new Collector("uday", 42);

        District district6 = new District("Sydney District", collector6);
        District[] districts6 = {district6};

        City city6 = new City("Sydney", 18, districts6);
        City[] cities6 = {city6};

        State state6 = new State("New South Wales", 8000000L, cities6);
        State[] states6 = {state6};

        Address address6 = new Address(60, 2000, state6);
        President president6 = new President("Anthony Albanese", 60, address6);

        Country country6 = new Country("Australia", president6, states6);

        store.save(country6);
        store.display();

        System.out.println("========================================================================");

        Collector collector7 = new Collector("Tan", 38);

        District district7 = new District("Central District", collector7);
        District[] districts7 = {district7};

        City city7 = new City("Singapore City", 5, districts7);
        City[] cities7 = {city7};

        State state7 = new State("Central Region", 5700000L, cities7);
        State[] states7 = {state7};

        Address address7 = new Address(70, 179000, state7);
        President president7 = new President("Tharman Shanmugaratnam", 66, address7);

        Country country7 = new Country("Singapore", president7, states7);

        store.save(country7);
        store.display();

        System.out.println("========================================================================");

        Collector collector8 = new Collector("James", 47);

        District district8 = new District("Edinburgh District", collector8);
        District[] districts8 = {district8};

        City city8 = new City("Edinburgh", 10, districts8);
        City[] cities8 = {city8};

        State state8 = new State("Scotland Region", 5500000L, cities8);
        State[] states8 = {state8};

        Address address8 = new Address(80, 1001, state8);
        President president8 = new President("Humza Yousaf", 39, address8);

        Country country8 = new Country("Scotland", president8, states8);

        store.save(country8);
        store.display();

        System.out.println("----------------------------------------------------------------");

        Country ref=store.findByName("Australia");
        System.out.println(ref);

         System.out.println("----------------------------------------------------------------");

         State ref1=store.findByStateName("karnataka");
        System.out.println(ref1);

        System.out.println("----------------------------------------------------------------");

        store.findAllCityByStateName("karnataka");

        System.out.println("----------------------------------------------------------------");

        store.findNoOfDistrictsByCityName("Zurich");

        System.out.println("----------------------------------------------------------------");
        store.findByCollectorName("Ravi");





    }
}

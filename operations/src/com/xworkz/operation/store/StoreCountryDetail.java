package com.xworkz.operation.store;

import com.xworkz.operation.name.City;
import com.xworkz.operation.name.Country;
import com.xworkz.operation.name.District;
import com.xworkz.operation.name.State;

public class StoreCountryDetail {
    Country[] countries;
    int curtIndex = 0;

    public StoreCountryDetail(Country[] countries) {
        this.countries = countries;

    }

    public void save(Country country) {
        System.out.println("executing to store the country details");
        if (this.countries != null && country != null) {
            if (curtIndex < countries.length) {
                this.countries[curtIndex] = country;
                this.curtIndex++;
            }

        } else {
            System.out.println("no details to store");
        }
    }

    public void display() {

        System.out.println("Displaying all countries:");

        for (int i = 0; i < curtIndex; i++) {

            if (countries[i] != null) {
                countries[i].display();
                System.out.println("------------------");
            }
        }
    }

    public Country findByName(String name) {
        if (countries != null && name != null) {
            for (Country country : this.countries) {
                if (country != null) {
                    System.out.println("country:" + country.name);
                    if (country.name == name) {
                        System.out.println("country is matching");
                        return country;

                    }
                }
            }
        }
        return null;
    }

    public State findByStateName(String name) {
        if (countries != null && name != null) {
            for (Country country : countries) {
                if (country != null && country.states != null) {
                    for (State state : country.states) {
                        if (state != null) {
                            if (state.name.equals(name)) {
                                System.out.println("State matched: " + state.name);
                                return state;
                            } else {
                                System.out.println("not matched");
                            }

                        }
                    }

                }
            }
        }
        return null;
    }

    public City[] findAllCityByStateName(String name){
        if(countries!=null && name!=null){
            for(Country country:countries){
                if(country!=null && country.states!=null){

                    for(State state:country.states){
                        if(state!=null){

                            if(state.name.equals(name)){
                                System.out.println("State matched:"+state.name);

                                if(state.cities!=null){
                                    for(City city:state.cities){
                                        if(city!=null){
                                            System.out.println("City:"+city.name);
                                        }
                                    }
                                }

                                return state.cities;
                            }else{
                                System.out.println("Not matched:"+state.name);
                            }

                        }
                    }

                }
            }
        }
        System.out.println("No state found with given name");
        return null;
    }

    public int findNoOfDistrictsByCityName(String name){
        if(countries!=null && name!=null){
            for(Country country:countries){
                if(country!=null && country.states!=null){

                    for(State state:country.states){
                        if(state!=null && state.cities!=null){

                            for(City city:state.cities){
                                if(city!=null){

                                    if(city.name.equals(name)){
                                        System.out.println("City matched:"+city.name);

                                        if(city.districts!=null){
                                            System.out.println("No of districts:"+city.districts.length);
                                            return city.districts.length;
                                        }else{
                                            System.out.println("No districts available");
                                            return 0;
                                        }
                                    }else{
                                        System.out.println("Not matched:"+city.name);
                                    }

                                }
                            }

                        }
                    }

                }
            }
        }
        System.out.println("No city found with given name");
        return 0;
    }
    public Country findByCollectorName(String name){
        if(countries!=null && name!=null){
            for(Country country:countries){
                if(country!=null && country.states!=null){

                    for(State state:country.states){
                        if(state!=null && state.cities!=null){

                            for(City city:state.cities){
                                if(city!=null && city.districts!=null){

                                    for(District district:city.districts){
                                        if(district!=null && district.collector!=null){

                                            if(district.collector.name.equals(name)){
                                                System.out.println("Collector matched:"+name);
                                                System.out.println("Country:"+country.name);
                                                return country;
                                            }else{
                                                System.out.println("Not matched:"+district.collector.name);
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
        System.out.println("No collector found with given name");
        return null;
    }
}


package com.xworkz.string.movie;

import java.util.Arrays;

public class Movie {
    String name;
    double budget;
    MovieType type;
    String[] actors;
    Production production;

    public Movie(String name,double budget,MovieType type,String[] actors,Production production){
        this.name=name;
        this.budget=budget;
        this.type=type;
        this.actors=actors;
        this.production=production;
    }

    void play(){
        System.out.println("Movie is playing");
    }

    void stop(){
        System.out.println("Movie has stopped");
    }

    @Override
    public String toString(){
        return "name="+name+
                ",budget="+budget+
                ",type="+type+
                ",actors="+Arrays.toString(actors)+
                ",production="+production;
    }
}
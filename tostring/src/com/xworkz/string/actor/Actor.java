package com.xworkz.string.actor;

import java.util.Arrays;

public class Actor {
    String name;
    ActorType type;
    String[] movies;
    Industry industry;
    int age;

    public Actor(String name,ActorType type,String[] movies,Industry industry,int age){
        this.name=name;
        this.type=type;
        this.movies=movies;
        this.industry=industry;
        this.age=age;
    }

    void act(){
        System.out.println("Actor is acting");
    }

    void promote(){
        System.out.println("Actor is promoting movies");
    }

    @Override
    public String toString(){
        return "name="+name+
                ",type="+type+
                ",movies="+Arrays.toString(movies)+
                ",industry="+industry+
                ",age="+age;
    }
}
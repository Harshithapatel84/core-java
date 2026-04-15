package com.xworkz.string.movie;

public class Production {
    String name;

    public Production(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return name;
    }
}
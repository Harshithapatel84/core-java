package com.xworkz.string.room;

public class Hotel {
    String name;

    public Hotel(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return name;
    }
}
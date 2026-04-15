package com.xworkz.string.jail;

public class Warden {
    String name;

    public Warden(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return name;
    }
}
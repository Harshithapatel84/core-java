package com.xworkz.string.jail;

import java.util.Arrays;

public class Jail {
    String name;
    int capacity;
    JailType type;
    String[] facilities;
    Warden warden;

    public Jail(String name,int capacity,JailType type,String[] facilities,Warden warden){
        this.name=name;
        this.capacity=capacity;
        this.type=type;
        this.facilities=facilities;
        this.warden=warden;
    }

    void open(){
        System.out.println("Jail is open for operations");
    }

    void close(){
        System.out.println("Jail is secured and closed");
    }

    @Override
    public String toString(){
        return "name="+name+
                ",capacity="+capacity+
                ",type="+type+
                ",facilities="+Arrays.toString(facilities)+
                ",warden="+warden;
    }
}
package com.xworkz.string.Concert;

import java.util.Arrays;

public class Concert {
    String name;
    double entryFee;
    ConcertType type;
    String[] singers;
    Location location;

    public Concert(String name,double entryFee,ConcertType type,String[] singers,Location location){
        this.name=name;
        this.entryFee=entryFee;
        this.type=type;
        this.singers=singers;
        this.location=location;
    }

    void start(){
        System.out.println("Concert is starting");
    }

    void end(){
        System.out.println("Concert has ended");
    }

    @Override
    public String toString(){
        return "name="+name+
                ",entryFee="+entryFee+
                ",type="+type+
                ",singers="+Arrays.toString(singers)+
                ",location="+location;
    }

}
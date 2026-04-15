package com.xworkz.string.dollar;

import java.util.Arrays;

public class Dollar {
    String country;
    double value;
    DollarType type;
    String[] features;
    Bank bank;

    public Dollar(String country,double value,DollarType type,String[] features,Bank bank){
        this.country=country;
        this.value=value;
        this.type=type;
        this.features=features;
        this.bank=bank;
    }

    void use(){
        System.out.println("Dollar is used for transactions");
    }

    void exchange(){
        System.out.println("Dollar is exchanged to local currency");
    }

    @Override
    public String toString(){
        return "country="+country+
                ",value="+value+
                ",type="+type+
                ",features="+Arrays.toString(features)+
                ",bank="+bank;
    }
}
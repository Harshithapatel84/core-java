package com.xworkz.string.plate;

import java.util.Arrays;

public class Plate {
    String type;
    double price;
    PlateType category;
    String[] items;
    Brand brand;

    public Plate(String type,double price,PlateType category,String[] items,Brand brand){
        this.type=type;
        this.price=price;
        this.category=category;
        this.items=items;
        this.brand=brand;
    }

    void serve(){
        System.out.println("Plate is used for serving food");
    }

    void clean(){
        System.out.println("Plate is cleaned after use");
    }

    @Override
    public String toString(){
        return "type="+type+
                ",price="+price+
                ",category="+category+
                ",items="+Arrays.toString(items)+
                ",brand="+brand;
    }
}
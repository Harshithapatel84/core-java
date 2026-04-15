package com.xworkz.string.chain;

import java.util.Arrays;

public class Chain {
    String type;
    double price;
    ChainType category;
    String[] materials;
    Brand brand;

    public Chain(String type,double price,ChainType category,String[] materials,Brand brand){
        this.type=type;
        this.price=price;
        this.category=category;
        this.materials=materials;
        this.brand=brand;
    }

    void wear(){
        System.out.println("Chain is worn as an accessory");
    }

    void remove(){
        System.out.println("Chain is removed safely");
    }

    @Override
    public String toString(){
        return "type="+type+
                ",price="+price+
                ",category="+category+
                ",materials="+Arrays.toString(materials)+
                ",brand="+brand;
    }
}
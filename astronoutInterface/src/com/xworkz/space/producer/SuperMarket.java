package com.xworkz.space.producer;

public class SuperMarket implements Producer{
    public String[] supplyProducts(){

        System.out.println("running supplyProducts in SuperMarket");

        String[] products={"Rice","Oil","Soap","Milk"};

        return products;
    }
}

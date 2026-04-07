package com.prg.Forest.groceryItem;

public class Grocery {
    String name;
    double weight;
    double cost;
    String type;
    boolean available;

    public Grocery(String name, double weight, double cost, String type, boolean available) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.type = type;
        this.available = available;
    }
    public void display()
    {
        System.out.println("name:"+this.name);
        System.out.println("weight:"+this.weight);
        System.out.println("cost:"+this.cost);
        System.out.println("type:"+this.type);
        System.out.println("available:"+this.available);
    }
}

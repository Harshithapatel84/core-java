package com.prg.Forest.doll;

public class Toy {
    String name;
    String color;
    double price;
    String material;
    double height;

    public Toy(String name, String color, double price, String material, double height) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.material = material;
        this.height = height;
    }
     public void display()
    {
        System.out.println("name:"+this.name);
        System.out.println("color:"+this.color);
        System.out.println("price:"+this.price);
        System.out.println("material:"+this.material);
        System.out.println("height:"+this.height);
    }
}

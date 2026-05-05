package com.app.instance;

public class Cylinder implements Cloneable {
    double weight=20;

    public static void main(String[] args) throws CloneNotSupportedException{
        Cylinder c1=new Cylinder();
        Cylinder c2= (Cylinder)c1.clone();
        System.out.println(c2.weight);

    }
}

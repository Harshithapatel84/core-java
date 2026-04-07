package com.prg.Forest.card;

public class PanCard {
    String holderName;
    String no;
    String address;
    String color;
    boolean photo;

    public PanCard(String holderName,String no,String address,String color,boolean photo)
    {
        this.holderName=holderName;
        this.no=no;
        this.address=address;
        this.color=color;
        this.photo=photo;
    }

    public void display()
    {
        System.out.println("holderName:"+this.holderName);
        System.out.println("no:"+this.no);
        System.out.println("address:"+this.address);
        System.out.println("color:"+this.color);
        System.out.println("photo:"+this.photo);
    }
}
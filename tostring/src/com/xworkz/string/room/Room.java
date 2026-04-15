package com.xworkz.string.room;

import java.util.Arrays;

public class Room {
    String type;
    double price;
    RoomType category;
    String[] facilities;
    Hotel hotel;

    public Room(String type,double price,RoomType category,String[] facilities,Hotel hotel){
        this.type=type;
        this.price=price;
        this.category=category;
        this.facilities=facilities;
        this.hotel=hotel;
    }

    void book(){
        System.out.println("Room is booked");
    }

    void vacate(){
        System.out.println("Room is vacated");
    }

    @Override
    public String toString(){
        return "type="+type+
                ",price="+price+
                ",category="+category+
                ",facilities="+Arrays.toString(facilities)+
                ",hotel="+hotel;
    }
}
package com.xworkz.string.room;

public class LuxuryRoom extends Room {

    int roomNumber;
    String viewType;

    public LuxuryRoom(String type,double price,RoomType category,String[] facilities,
                      Hotel hotel,int roomNumber,String viewType){
        super(type,price,category,facilities,hotel);
        this.roomNumber=roomNumber;
        this.viewType=viewType;
    }

    @Override
    void book(){
        System.out.println("Luxury room is booked with premium service");
    }

    @Override
    void vacate(){
        System.out.println("Luxury room is vacated after checkout");
    }

    @Override
    public String toString(){
        return super.toString()+
                ",roomNumber="+roomNumber+
                ",viewType="+viewType;
    }
}
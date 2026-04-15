package com.xworkz.string.room;

public class RoomRunner {
    public static void main(String[] args) {

        String[] facilities={"AC","WiFi","TV"};
        RoomType type=RoomType.DELUXE;
        Hotel hotel=new Hotel("Taj Hotel");

        Room room=new Room("Deluxe",3000,type,facilities,hotel);
        room.book();
        room.vacate();
        System.out.println(room);

        System.out.println("==========================================================");


        LuxuryRoom room1=new LuxuryRoom("Suite",8000,type,facilities,hotel,101,"Sea View");
        room1.book();
        room1.vacate();
        System.out.println(room1);
    }
}
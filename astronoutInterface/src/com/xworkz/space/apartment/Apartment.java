package com.xworkz.space.apartment;

public interface Apartment {

    String name = "Sky Residency";
    int floors = 12;

    void rent();
    void buy();
    void maintain();

    default void facilities() {
        System.out.println("Gym, Parking, Security available");
    }
    default void occupy()
    {
        System.out.println("executing to occupy the apartment by people");
    }

    static void locationInfo() {
        System.out.println("Located in urban area");
    }
}
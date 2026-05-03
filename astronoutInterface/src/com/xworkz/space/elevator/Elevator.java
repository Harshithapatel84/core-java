package com.xworkz.space.elevator;

public interface Elevator {

    String brand = "Otis";
    int capacity = 10;

    void move();
    void openDoor();
    void closeDoor();

    default void safety() {
        System.out.println("Elevator has safety features");
    }

    static void type() {
        System.out.println("Electric elevator");
    }
}
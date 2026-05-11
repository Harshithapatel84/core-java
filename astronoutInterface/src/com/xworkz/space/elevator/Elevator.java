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
    default  void run()
    {
        System.out.println("execute the running movement of......");
    }

    static void type() {
        System.out.println("Electric elevator");
    }
}
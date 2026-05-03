package com.xworkz.space.train;

public interface Train {

    String name = "Express";
    int coaches = 20;

    void start();
    void accelerate();
    void brake();


    default void stop() {
        System.out.println("Train stops at stations");
    }

    static void trackType() {
        System.out.println("Runs on railway tracks");
    }
}
package com.xworkz.space.mountain;

public interface Mountain {

    String name = "Mount Everest";
    double distance = 8848;

    void climb();
    void descend();
    void explore();



    default void showDetails() {
        System.out.println("Mountain is covered with snow and attracts climbers");
    }

    static void mountainInfo() {
        System.out.println("Mountains are large landforms that rise above surroundings");
    }
}
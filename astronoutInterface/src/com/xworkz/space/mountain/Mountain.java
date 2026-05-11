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
    default void view()
    {
        System.out.println("execute the view of the mountain");
    }

    static void mountainInfo() {
        System.out.println("Mountains are large landforms that rise above surroundings");
    }
}
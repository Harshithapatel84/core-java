package com.xworkz.space.cloud;

public interface Cloud {

    String color="blue";
    int layer=120;
    double height=15.76;

    void rain();
    void smooky();
    void sky();

    default void climate()
    {
        System.out.println("execute the climate...");
    }
    default void shade()
    {
        System.out.println("shade of the cloud");
    }
    static void info()
    {
        System.out.println("execute the cloud info...");
    }

}

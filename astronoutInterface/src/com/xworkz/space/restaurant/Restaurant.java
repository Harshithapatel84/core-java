package com.xworkz.space.restaurant;

public interface Restaurant {

    String name = "Udupi";
    String cuisine = "South Indian";

    void serve();
    void sit();
    void reserve();

    default void menu() {
        System.out.println("Serves dosa, idli, meals");
    }

    static void rating() {
        System.out.println("Rated 4.5 stars");
    }
}
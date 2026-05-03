package com.xworkz.space.market;

public interface Market {

    String name = "KR Market";
    String location = "Bangalore";

    void openMarket();

    default void displayItems() {
        System.out.println("Market displays fruits, vegetables, and flowers");
    }

    static void marketInfo() {
        System.out.println("Market is a place for buying and selling goods");
    }
}
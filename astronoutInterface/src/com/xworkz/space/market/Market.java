package com.xworkz.space.market;

public interface Market {

    String name = "KR Market";
    String location = "Bangalore";

    void openMarket();
    void business();
    void inf0();

    default void displayItems()
    {
        System.out.println("Market displays fruits, vegetables, and flowers");
    }
    default  void close()
    {
        System.out.println("market is closed");
    }

    static void marketInfo() {
        System.out.println("Market is a place for buying and selling goods");
    }
}
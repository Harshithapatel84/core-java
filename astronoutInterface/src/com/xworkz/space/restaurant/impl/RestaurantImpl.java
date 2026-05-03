package com.xworkz.space.restaurant.impl;

import com.xworkz.space.restaurant.Restaurant;

public class RestaurantImpl implements Restaurant {

    @Override
    public void serve() {
        System.out.println("Serving customers");
    }

    @Override
    public void sit() {
        System.out.println("as a seating arrangements");
    }

    @Override
    public void reserve() {
        System.out.println("it can reserve the seats");
    }
}
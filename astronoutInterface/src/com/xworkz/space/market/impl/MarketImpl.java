package com.xworkz.space.market.impl;

import com.xworkz.space.market.Market;

public class MarketImpl implements Market {

    @Override
    public void openMarket() {
        System.out.println("Market opens early in the morning");
    }

    @Override
    public void displayItems() {
        System.out.println("Market sells fruits, vegetables, and flowers");
    }
}
package com.xworkz.space.market.impl;

import com.xworkz.space.market.Market;

public class MarketImpl implements Market {

    @Override
    public void openMarket() {
        System.out.println("Market opens early in the morning");
    }

    @Override
    public void business() {
        System.out.println("to do business");
    }

    @Override
    public void inf0() {
        System.out.println("execute the market info");
    }


}
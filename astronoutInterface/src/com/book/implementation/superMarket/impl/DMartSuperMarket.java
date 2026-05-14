package com.book.implementation.superMarket.impl;

import com.book.implementation.superMarket.SuperMarket;

public class DMartSuperMarket implements SuperMarket {
    @Override
    public void purchase() {
        System.out.println("purchase things,items......");
    }

    @Override
    public void discount() {
        System.out.println("discount applied on every product");
    }
}

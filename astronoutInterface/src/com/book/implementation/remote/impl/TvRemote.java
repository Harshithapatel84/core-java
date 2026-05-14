package com.book.implementation.remote.impl;

import com.book.implementation.remote.Remote;

public class TvRemote implements Remote {
    @Override
    public void turnOn() {
        System.out.println("turn on television");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off tv");
    }
}

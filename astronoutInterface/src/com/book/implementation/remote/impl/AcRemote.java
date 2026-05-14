package com.book.implementation.remote.impl;

import com.book.implementation.remote.Remote;

public class AcRemote implements Remote {
    @Override
    public void turnOn() {
        System.out.println("turn on ac");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off ac");
    }
}

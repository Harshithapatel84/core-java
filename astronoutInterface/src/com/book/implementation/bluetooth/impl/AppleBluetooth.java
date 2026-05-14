package com.book.implementation.bluetooth.impl;

import com.book.implementation.bluetooth.Bluetooth;

public class AppleBluetooth implements Bluetooth {


    @Override
    public void connect() {
        System.out.println("can connect with other devices");
    }

    @Override
    public void disconnect() {
        System.out.println("bluetooth disconnected");

    }
}

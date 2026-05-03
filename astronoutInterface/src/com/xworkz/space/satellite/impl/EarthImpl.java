package com.xworkz.space.satellite.impl;

import com.xworkz.space.satellite.Earth;

public class EarthImpl implements Earth {
    @Override
    public void rotate() {
        System.out.println("earth rotates at every single day");
    }
    public void revolve() {
        System.out.println("Earth revolves around the Sun");
    }

    @Override
    public void supportLife() {
        System.out.println("Earth supports life and living organisms");
    }
}

package com.xworkz.space.train.impl;

import com.xworkz.space.train.Train;

public class TrainImpl implements Train {

    @Override
    public void start() {
        System.out.println("Train starts moving");
    }
    public void accelerate() {
        System.out.println("Train is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Train is slowing down using brakes");
    }
}
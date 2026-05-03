package com.xworkz.space.elevator.impl;

import com.xworkz.space.elevator.Elevator;

public class ElevatorImpl implements Elevator {

    @Override
    public void move() {
        System.out.println("Elevator moves up and down");
    }
    public void openDoor() {
        System.out.println("Elevator door is opening");
    }

    @Override
    public void closeDoor() {
        System.out.println("Elevator door is closing");
    }

}
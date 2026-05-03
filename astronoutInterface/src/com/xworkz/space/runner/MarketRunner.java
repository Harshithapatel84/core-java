package com.xworkz.space.runner;

import com.xworkz.space.elevator.Elevator;
import com.xworkz.space.elevator.impl.ElevatorImpl;
import com.xworkz.space.market.Market;
import com.xworkz.space.market.impl.MarketImpl;
import com.xworkz.space.train.Train;
import com.xworkz.space.train.impl.TrainImpl;

public class MarketRunner {
    public static void main(String[] args) {

        Market market = new MarketImpl();

        market.openMarket();

        market.displayItems();

        Market.marketInfo();

        System.out.println("Market name: " + Market.name);
        System.out.println("Market location: " + Market.location);

        System.out.println("=================================================");

        Train obj = new TrainImpl();
        obj.start();
        obj.accelerate();
        obj.brake();
        obj.stop();
        Train.trackType();

        System.out.println(Train.name);
        System.out.println(Train.coaches);

        System.out.println("======================================");

        Elevator elevator = new ElevatorImpl();
        elevator.move();
        elevator.closeDoor();
        elevator.openDoor();
        elevator.safety();
        Elevator.type();

        System.out.println(Elevator.brand);
        System.out.println(Elevator.capacity);
    }
}
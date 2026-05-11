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
        Object object=new MarketImpl();
        MarketImpl mrimpl=new MarketImpl();

        market.openMarket();
        market.inf0();
        market.displayItems();
        market.close();
        market.business();

        Market.marketInfo();

        System.out.println("Market name: " + Market.name);
        System.out.println("Market location: " + Market.location);

        System.out.println("=================================================");

        Train train = new TrainImpl();
        train.start();
        train.accelerate();
        train.brake();
        train.stop();
        train.move();

        Train.trackType();

        System.out.println(Train.name);
        System.out.println(Train.coaches);

        System.out.println("======================================");

        Elevator elevator = new ElevatorImpl();
        elevator.move();
        elevator.closeDoor();
        elevator.openDoor();
        elevator.safety();
        elevator.run();
        Elevator.type();


        System.out.println(Elevator.brand);
        System.out.println(Elevator.capacity);
    }
}
package com.xworkz.space.runner;

import com.xworkz.space.election.Election;
import com.xworkz.space.election.impl.ElectionImpl;
import com.xworkz.space.mountain.Mountain;
import com.xworkz.space.mountain.impl.MountainImpl;
import com.xworkz.space.restaurant.Restaurant;
import com.xworkz.space.restaurant.impl.RestaurantImpl;

public class MountainRunner {
    public static void main(String[] args) {

        Mountain mountain = new MountainImpl();

        mountain.climb();
        mountain.descend();
        mountain.explore();

        mountain.showDetails();
        mountain.view();

        Mountain.mountainInfo();

        System.out.println("Mountain name: " + Mountain.name);
        System.out.println("Mountain distance: " + Mountain.distance);

        System.out.println("======================================================");

        Restaurant obj = new RestaurantImpl();
        obj.serve();
        obj.reserve();
        obj.sit();
        obj.menu();
        Restaurant.rating();

        System.out.println(Restaurant.name);
        System.out.println(Restaurant.cuisine);

        System.out.println("==============================================");

        Election election = new ElectionImpl();
        election.conduct();
        election.vote();
        election.declareResult();
        election.rules();
        Election.authority();

        System.out.println(Election.type);
        System.out.println(Election.voters);
    }
}
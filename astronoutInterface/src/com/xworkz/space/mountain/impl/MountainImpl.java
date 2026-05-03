package com.xworkz.space.mountain.impl;

import com.xworkz.space.mountain.Mountain;

public class MountainImpl implements Mountain {

    @Override
    public void climb() {
        System.out.println("Climbing the mountain requires skill and endurance");
    }

    @Override
    public void showDetails() {
        System.out.println("Mountain has snow peaks and attracts many tourists");
    }
    @Override
    public void descend() {
        System.out.println("Descending safely from the mountain");
    }

    @Override
    public void explore() {
        System.out.println("Exploring mountain regions and wildlife");
    }

}
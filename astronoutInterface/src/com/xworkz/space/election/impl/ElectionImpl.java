package com.xworkz.space.election.impl;

import com.xworkz.space.election.Election;

public class ElectionImpl implements Election {

    @Override
    public void conduct() {
        System.out.println("Election is being conducted");
    }
    public void vote() {
        System.out.println("Citizens are casting their votes");
    }

    @Override
    public void declareResult() {
        System.out.println("Election results are announced");
    }

}
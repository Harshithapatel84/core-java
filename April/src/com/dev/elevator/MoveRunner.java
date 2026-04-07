package com.dev.elevator;

public class MoveRunner {

    public static void main(String[] args) {

        move move1=new move(45.5, 50, "Bangalore");

        Lift lift=new Lift(move1, "up");

        lift.showData();
    }
}
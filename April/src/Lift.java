package com.dev.elevator;
public class Lift {
    move movement;
    String type;

    public Lift(move movement, String type) {
        this.movement = movement;
        this.type = type;
    }
    void showData()
    {
        System.out.println("lift movement:"+this.movement);
        System.out.println("lift type:"+this.type);
        this.movement.printInfo();
    }
}

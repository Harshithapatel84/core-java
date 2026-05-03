package com.xworkz.space.election;

public interface Election {

    String type = "General Election";
    int voters = 1000000;

    void conduct();
    void vote();
    void declareResult();

    default void rules() {
        System.out.println("Follow election guidelines");
    }

    static void authority() {
        System.out.println("Election Commission conducts elections");
    }
}
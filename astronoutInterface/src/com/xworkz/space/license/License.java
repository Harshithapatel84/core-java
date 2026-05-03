package com.xworkz.space.license;

public interface License {

    String type = "Driving License";
    int validityYears = 20;

    void apply();
    void renew();
    void verify();

    default void rules() {
        System.out.println("Follow traffic rules strictly");
    }

    static void authority() {
        System.out.println("Issued by Transport Department");
    }
}
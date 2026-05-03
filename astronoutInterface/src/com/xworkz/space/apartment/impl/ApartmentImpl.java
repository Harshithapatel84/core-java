package com.xworkz.space.apartment.impl;

import com.xworkz.space.apartment.Apartment;

public class ApartmentImpl implements Apartment {

    @Override
    public void rent() {
        System.out.println("Apartment is available for rent");
    }
    public void buy() {
        System.out.println("Apartment can be purchased");
    }

    @Override
    public void maintain() {
        System.out.println("Apartment maintenance is handled regularly");
    }
}
package com.xworkz.space.runner;

import com.book.implementation.superMarket.Producer;
import com.xworkz.space.hotel.BindedMenuCard;
import com.xworkz.space.hotel.Kitchen;
import com.xworkz.space.hotel.MenuCard;


public class HotelRunner {
    public static void main(String[] args) {

        MenuCard menuCard = new BindedMenuCard();

        Kitchen kitchen = new Kitchen(menuCard);

        kitchen.prepare();


    }
}

package com.xworkz.space.runner;

import com.xworkz.space.hotel.BindedMenuCard;
import com.xworkz.space.hotel.Kitchen;
import com.xworkz.space.hotel.MenuCard;
import com.xworkz.space.producer.Customer;
import com.xworkz.space.producer.Producer;
import com.xworkz.space.producer.SuperMarket;

public class HotelRunner {
    public static void main(String[] args) {

        MenuCard menuCard = new BindedMenuCard();

        Kitchen kitchen = new Kitchen(menuCard);

        kitchen.prepare();

        Producer producer = new SuperMarket();

        Customer customer = new Customer(producer);

        customer.buyProducts();
    }
}

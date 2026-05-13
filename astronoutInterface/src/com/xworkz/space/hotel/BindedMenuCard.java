package com.xworkz.space.hotel;

public class BindedMenuCard implements MenuCard{

    @Override
    public String[] getItem(int tableNo,String customerName){

        System.out.println("running getItem in BindedMenuCard");

        String[] items={"idli","dosa","coffee"};

        return items;
    }
}
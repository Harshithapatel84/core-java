package com.xworkz.string.medicalshop;

import java.util.Arrays;

public class MedicalShop {
    String name;
    double revenue;
    ShopType type;
    String[] medicines;
    Owner owner;

    public MedicalShop(String name,double revenue,ShopType type,String[] medicines,Owner owner){
        this.name=name;
        this.revenue=revenue;
        this.type=type;
        this.medicines=medicines;
        this.owner=owner;
    }

    void open(){
        System.out.println("Medical shop is open");
    }

    void close(){
        System.out.println("Medical shop is closed");
    }

    @Override
    public String toString(){
        return "name="+name+
                ",revenue="+revenue+
                ",type="+type+
                ",medicines="+Arrays.toString(medicines)+
                ",owner="+owner;
    }
}
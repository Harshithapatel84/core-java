package com.xworkz.string.slipper;

public class Slipper {
    String type;
    double cost;
    String[] brands;
    int size;
    SlipperCompany company;

    public Slipper(String type, double cost, String[] brands, int size, SlipperCompany company) {
        this.type = type;
        this.cost = cost;
        this.brands = brands;
        this.size = size;
        this.company = company;
    }


    void wear()
    {
        System.out.println("flat slippers are easy to carry");
    }
    void showDetail(){
        System.out.println("executing the slipper details");

    }

    @Override
    public String toString() {
        return "type="+type+
                ",cost="+cost +
                ",brand="+brands+
                ",size="+size+
                ",company="+company;
    }
}

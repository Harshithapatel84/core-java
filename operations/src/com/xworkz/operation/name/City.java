package com.xworkz.operation.name;

public class City {
    public String name;
    public int noOfDistrict;
    public District[] districts;

    public City(String name,int noOfDistrict,District[] districts) {
        this.name=name;
        this.noOfDistrict=noOfDistrict;
        this.districts=districts;
    }
}

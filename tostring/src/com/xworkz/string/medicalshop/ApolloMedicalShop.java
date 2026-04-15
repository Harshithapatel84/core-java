package com.xworkz.string.medicalshop;

public class ApolloMedicalShop extends MedicalShop {

    int noOfEmployees;
    String location;

    public ApolloMedicalShop(String name,double revenue,ShopType type,String[] medicines,
                             Owner owner,int noOfEmployees,String location){
        super(name,revenue,type,medicines,owner);
        this.noOfEmployees=noOfEmployees;
        this.location=location;
    }

    @Override
    void open(){
        System.out.println("Apollo medical shop is open 24/7");
    }

    @Override
    void close(){
        System.out.println("Apollo medical shop closes late night");
    }

    @Override
    public String toString(){
        return super.toString()+
                ",noOfEmployees="+noOfEmployees+
                ",location="+location;
    }
}
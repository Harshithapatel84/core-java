package com.xworkz.string.plate;

public class CeramicPlate extends Plate {

    int size;
    String design;

    public CeramicPlate(String type,double price,PlateType category,String[] items,
                        Brand brand,int size,String design){
        super(type,price,category,items,brand);
        this.size=size;
        this.design=design;
    }

    @Override
    void serve(){
        System.out.println("Ceramic plate is used for serving food");
    }

    @Override
    void clean(){
        System.out.println("Ceramic plate is gently cleaned");
    }

    @Override
    public String toString(){
        return super.toString()+
                ",size="+size+
                ",design="+design;
    }
}
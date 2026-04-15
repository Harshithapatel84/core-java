package com.xworkz.string.helmet;

public class BikeHelmet extends Helmet {

    int weight;
    String safetyRating;

    public BikeHelmet(String brand,double price,HelmetType type,String[] features,
                      Manufacturer manufacturer,int weight,String safetyRating){
        super(brand,price,type,features,manufacturer);
        this.weight=weight;
        this.safetyRating=safetyRating;
    }

    @Override
    void wear(){
        System.out.println("Bike helmet is worn while riding");
    }

    @Override
    void remove(){
        System.out.println("Bike helmet is removed after riding");
    }

    @Override
    public String toString(){
        return super.toString()+
                ",weight="+weight+
                ",safetyRating="+safetyRating;
    }
}
package com.xworkz.string.helmet;

import java.util.Arrays;

    public class Helmet {
        String brand;
        double price;
        HelmetType type;
        String[] features;
        Manufacturer manufacturer;

        public Helmet(String brand,double price,HelmetType type,String[] features,Manufacturer manufacturer){
            this.brand=brand;
            this.price=price;
            this.type=type;
            this.features=features;
            this.manufacturer=manufacturer;
        }

        void wear(){
            System.out.println("Helmet is used for safety");
        }

        void remove(){
            System.out.println("Helmet is removed after use");
        }

        @Override
        public String toString(){
            return "brand="+brand+
                    ",price="+price+
                    ",type="+type+
                    ",features="+Arrays.toString(features)+
                    ",manufacturer="+manufacturer;
        }
    }


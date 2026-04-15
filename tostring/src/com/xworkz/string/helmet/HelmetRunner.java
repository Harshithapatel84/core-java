package com.xworkz.string.helmet;

public class HelmetRunner {
    public static void main(String[] args) {

        String[] features={"visor","padding","ventilation"};
        HelmetType type=HelmetType.FULLFACE;
        Manufacturer manufacturer=new Manufacturer("Vega");

        Helmet helmet=new Helmet("Vega",1500,type,features,manufacturer);
        helmet.wear();
        helmet.remove();
        System.out.println(helmet);

        System.out.println("==========================================================");

        BikeHelmet helmet1=new BikeHelmet("Studds",2000,type,features,manufacturer,1200,"ISI");
        helmet1.wear();
        helmet1.remove();
        System.out.println(helmet1);
    }
}
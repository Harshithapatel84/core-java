package com.xworkz.string.medicalshop;

public class MedicalRunner {
    public static void main(String[] args) {

        String[] medicines={"Dolo","Paracetamol","Cetrizine"};
        ShopType type=ShopType.GENERAL;
        Owner owner=new Owner("Ramesh");

        MedicalShop shop=new MedicalShop("HealthCare",50000,type,medicines,owner);
        shop.open();
        shop.close();
        System.out.println(shop);

        System.out.println("==========================================================");

        ApolloMedicalShop shop1=new ApolloMedicalShop("Apollo",100000,type,medicines,owner,10,"Bangalore");
        shop1.open();
        shop1.close();
        System.out.println(shop1);
    }
}
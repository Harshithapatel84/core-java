package com.xworkz.string.chain;

public class ChainRunner {
    public static void main(String[] args) {

        String[] materials={"Gold","Alloy"};
        ChainType type=ChainType.GOLD;
        Brand brand=new Brand("Tanishq");

        Chain chain=new Chain("Neck Chain",15000,type,materials,brand);
        chain.wear();
        chain.remove();
        System.out.println(chain);

        System.out.println("==========================================================");

        GoldChain chain1=new GoldChain("Premium Chain",50000,type,materials,brand,20,"22K");
        chain1.wear();
        chain1.remove();
        System.out.println(chain1);
    }
}
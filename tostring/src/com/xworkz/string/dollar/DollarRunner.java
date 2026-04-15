package com.xworkz.string.dollar;

public class DollarRunner {
    public static void main(String[] args) {

        String[] features={"Watermark","Security Thread","Color Shift"};
        DollarType type=DollarType.USD;
        Bank bank=new Bank("Federal Reserve");

        Dollar dollar=new Dollar("USA",1,type,features,bank);
        dollar.use();
        dollar.exchange();
        System.out.println(dollar);

        System.out.println("==========================================================");

        USDollar dollar1=new USDollar("USA",100,type,features,bank,123456,"Jerome Powell");
        dollar1.use();
        dollar1.exchange();
        System.out.println(dollar1);
    }
}
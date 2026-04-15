package com.xworkz.string.dollar;

public class USDollar extends Dollar {

    int serialNumber;
    String governorName;

    public USDollar(String country,double value,DollarType type,String[] features,
                    Bank bank,int serialNumber,String governorName){
        super(country,value,type,features,bank);
        this.serialNumber=serialNumber;
        this.governorName=governorName;
    }

    @Override
    void use(){
        System.out.println("US Dollar is widely used globally");
    }

    @Override
    void exchange(){
        System.out.println("US Dollar has high exchange value");
    }

    @Override
    public String toString(){
        return super.toString()+
                ",serialNumber="+serialNumber+
                ",governorName="+governorName;
    }
}
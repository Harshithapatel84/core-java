package com.xworkz.string.chain;

public class GoldChain extends Chain {

    int weight;
    String purity;

    public GoldChain(String type,double price,ChainType category,String[] materials,
                     Brand brand,int weight,String purity){
        super(type,price,category,materials,brand);
        this.weight=weight;
        this.purity=purity;
    }

    @Override
    void wear(){
        System.out.println("Gold chain is worn for special occasions");
    }

    @Override
    void remove(){
        System.out.println("Gold chain is carefully removed");
    }

    @Override
    public String toString(){
        return super.toString()+
                ",weight="+weight+
                ",purity="+purity;
    }
}
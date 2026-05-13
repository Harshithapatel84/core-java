package com.xworkz.space.producer;

public class Customer{

    private Producer producer;

    public Customer(){
        System.out.println("running no arg constructor");
    }

    public Customer(Producer producer){
        this.producer=producer;
    }

    public void buyProducts(){

        if(this.producer!=null){

            String[] products=this.producer.supplyProducts();

            if(products!=null){

                for(String product:products){
                    System.out.println(product);
                }
            }
        }
    }
}
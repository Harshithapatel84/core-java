package com.book.implementation.superMarket;

public class Producer {
    private SuperMarket superMarket;

     public Producer(SuperMarket superMarket)
    {
        this.superMarket=superMarket;
    }
    public void sell()
    {
        if(this.superMarket!=null)
        {
            this.superMarket.purchase();
            this.superMarket.discount();
            System.out.println("sell the products");
            System.out.println("discount given");
        }
    }
}

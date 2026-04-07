package com.prg.Forest.mall;

public class Shop {
    String name;
    String location;
    int noOfWorker;
    int counter;
    boolean open;

    public Shop(String name, String location, int noOfWorker, int counter, boolean open) {
        this.name = name;
        this.location = location;
        this.noOfWorker = noOfWorker;
        this.counter = counter;
        this.open = open;
    }
    void info()
    {
        System.out.println("executing to display the details");
        System.out.println("shop name:"+this.name);
        System.out.println("location:"+this.location);
        System.out.println("bo of worker:"+this.noOfWorker);
        System.out.println("counter:"+this.counter);
        System.out.println("is shop open:"+this.open);
    }
}

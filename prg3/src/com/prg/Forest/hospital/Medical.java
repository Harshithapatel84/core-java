package com.prg.Forest.hospital;

public class Medical {
    String name;
    String location;
    int noOfWorker;
    String startTime;
    String type;

    public Medical(String name,String location,int noOfWorker,String startTime,String type)
    {
        this.name=name;
        this.location=location;
        this.noOfWorker=noOfWorker;
        this.startTime=startTime;
        this.type=type;
    }

    public void display()
    {
        System.out.println("name:"+this.name);
        System.out.println("location:"+this.location);
        System.out.println("noOfWorker:"+this.noOfWorker);
        System.out.println("startTime:"+this.startTime);
        System.out.println("type:"+this.type);
    }
}
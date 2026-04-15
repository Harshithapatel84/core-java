package com.xworkz.string.jail;

public class CentralJail extends Jail {

    int noOfCells;
    String securityLevel;

    public CentralJail(String name,int capacity,JailType type,String[] facilities,
                       Warden warden,int noOfCells,String securityLevel){
        super(name,capacity,type,facilities,warden);
        this.noOfCells=noOfCells;
        this.securityLevel=securityLevel;
    }

    @Override
    void open(){
        System.out.println("Central jail is open with strict security");
    }

    @Override
    void close(){
        System.out.println("Central jail is locked with high security");
    }

    @Override
    public String toString(){
        return super.toString()+
                ",noOfCells="+noOfCells+
                ",securityLevel="+securityLevel;
    }
}
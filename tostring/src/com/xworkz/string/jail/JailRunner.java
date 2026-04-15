package com.xworkz.string.jail;

public class JailRunner {
    public static void main(String[] args) {

        String[] facilities={"Medical","Food","Security"};
        JailType type=JailType.CENTRAL;
        Warden warden=new Warden("Sharma");

        Jail jail=new Jail("Central Jail",500,type,facilities,warden);
        jail.open();
        jail.close();
        System.out.println(jail);

        System.out.println("==========================================================");

        CentralJail jail1=new CentralJail("High Security Jail",1000,type,facilities,warden,200,"Maximum");
        jail1.open();
        jail1.close();
        System.out.println(jail1);
    }
}
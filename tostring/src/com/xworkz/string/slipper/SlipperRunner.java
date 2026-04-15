package com.xworkz.string.slipper;

public class SlipperRunner {
    public static void main(String[] args) {
        Color color=new Color("footWare shop");
        SlipperCompany company=SlipperCompany.PARAGON;
        String[] brands={"bata","woodlands","crocs"};
        Slipper slipper=new Slipper("heels",650,brands,28,company);
        slipper.wear();
        slipper.showDetail();
        System.out.println(slipper);

        System.out.println("====================================================");

        KidSlipper kid =new KidSlipper("heels",650,brands,28,company,2,"rubber");
        kid.wear();
        kid.showDetail();
        System.out.println(kid);

    }
}

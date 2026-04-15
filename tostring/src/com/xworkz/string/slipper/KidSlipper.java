package com.xworkz.string.slipper;

public class KidSlipper extends Slipper{
    int pair;
    String material;

    public KidSlipper(String type, double cost, String[] brands, int size, SlipperCompany company, int pair, String material) {
        super(type, cost, brands, size, company);
        this.pair = pair;
        this.material = material;
    }

    @Override
    void wear() {
        super.wear();
    }

    @Override
    void showDetail() {
        super.showDetail();
    }

    @Override
    public String toString() {
        return super.toString() +"pair:"+pair+",material:"+material;
    }
}

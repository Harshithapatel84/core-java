package com.xworkz.string.plate;

public class PlateRunner {
    public static void main(String[] args) {

        String[] items={"Rice","Curry","Chapati"};
        PlateType type=PlateType.STEEL;
        Brand brand=new Brand("Prestige");

        Plate plate=new Plate("Dinner Plate",200,type,items,brand);
        plate.serve();
        plate.clean();
        System.out.println(plate);

        System.out.println("==========================================================");

        CeramicPlate plate1=new CeramicPlate("Designer Plate",500,type,items,brand,12,"Floral");
        plate1.serve();
        plate1.clean();
        System.out.println(plate1);
    }
}
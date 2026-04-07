package com.prg.Forest.mall;

import com.prg.Forest.groceryItem.Grocery;
import com.prg.Forest.groceryItem.StroreGroceryItem;

import com.prg.Forest.doll.Toy;
import com.prg.Forest.doll.ToyDetail;

import com.prg.Forest.hospital.Medical;
import com.prg.Forest.hospital.MedicalDetail;

import com.prg.Forest.card.PanCard;
import com.prg.Forest.card.StorePanCardDetail;

public class ShopRunner {
    public static void main(String[] args) {
        Shop[] shop=new Shop[3];
        storeShopDetail store=new storeShopDetail(shop);
        Shop shop1=new Shop("mediacl shop","BTM layout",4,2,true);
        store.save(shop1);
        shop1.info();
        Shop shop2=new Shop("jewellery","Jayanagar",10,5,true);
        store.save(shop2);
        shop2.info();
        Shop shop3=new Shop("xerox shop","jp nagar",2,1,false);
        store.save(shop3);
        shop3.info();

        System.out.println("----------------------------------------------------");

        boolean getName=store.searchByName("BTM layout");
        System.out.println(getName);

        System.out.println("----------------------------------------------------");

        boolean update=store.updateCounter("jewellery",7);
        System.out.println(update);

        System.out.println("================================================================");

        Grocery[] grocery=new Grocery[3];
        StroreGroceryItem stroreGrocery=new StroreGroceryItem(grocery);

        Grocery g1 = new Grocery("Rice",5,250,"Grains",true);
        Grocery g2 = new Grocery("Milk",1,50,"Dairy",true);
        Grocery g3 = new Grocery("Apple",2,180,"Fruits",true);
        stroreGrocery.add(g1);
        g1.display();
        stroreGrocery.add(g2);
        g2.display();
        stroreGrocery.add(g3);
        g3.display();

        System.out.println("----------------------------------------------------");

        boolean displayCost=stroreGrocery.displayCost("Milk");
        System.out.println(displayCost);

        System.out.println("----------------------------------------------------");

        boolean update1=stroreGrocery.updateName("Dairy","curd");
        System.out.println(update1);

        System.out.println("===========================================================");

        Toy[] toys=new Toy[3];
        ToyDetail toyDetail=new ToyDetail(toys);

        Toy t1=new Toy("Teddy", "Brown",500,"Cotton",1.5);
        Toy t2=new Toy("Car","Red",300,"Plastic",0.5);
        Toy t3=new Toy("Doll","Pink",450,"Fiber",1.2);

        toyDetail.save(t1);
        t1.display();

        toyDetail.save(t2);
        t2.display();

        toyDetail.save(t3);
        t3.display();

        System.out.println("----------------------------------------------------");

        boolean search=toyDetail.searchByName("Car");
        System.out.println(search);

        System.out.println("----------------------------------------------------");

        boolean update2=toyDetail.updatePrice("Doll",600);
        System.out.println(update2);

        Medical[] medicals=new Medical[3];
        MedicalDetail detail=new MedicalDetail(medicals);

        Medical m1=new Medical("Apollo","BTM",50,"9AM","Hospital");
        Medical m2=new Medical("ClinicPlus","Jayanagar",20,"10AM","Clinic");
        Medical m3=new Medical("Care","JP Nagar",30,"8AM","Hospital");

        detail.save(m1);
        m1.display();

        detail.save(m2);
        m2.display();

        detail.save(m3);
        m3.display();

        System.out.println("------------------------------------------------");

        boolean search1=detail.searchByName("Apollo");
        System.out.println(search1);

        boolean update3=detail.updateWorkers("Care",40);
        System.out.println(update3);

        PanCard[] cards=new PanCard[3];
        StorePanCardDetail details=new StorePanCardDetail(cards);

        PanCard p1=new PanCard("ciya","ABCDE1234F","BTM","Blue",true);
        PanCard p2=new PanCard("banu","PQRSX5678K","Jayanagar","Black",true);
        PanCard p3=new PanCard("rahul","LMNOP4321Z","JP Nagar","Blue",false);

        details.save(p1);
        p1.display();

        details.save(p2);
        p2.display();

        details.save(p3);
        p3.display();

        System.out.println("--------------------------------");

        boolean search5=details.searchByNumber("ABCDE1234F");
        System.out.println(search5);

        boolean update5=details.updateAddress("LMNOP4321Z","Huliyar");
        System.out.println(update5);
    }
}




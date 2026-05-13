package com.xworkz.space.hotel;

public class Kitchen{

    private MenuCard menuCard;

    public Kitchen(){
        System.out.println("running no arg constructor of Kitchen");
    }

    public Kitchen(MenuCard menuCard){
        this.menuCard=menuCard;
        System.out.println("MenuCard parameter constructor");
    }

    public void prepare(){

        if(this.menuCard!=null){

            String[] items=this.menuCard.getItem(1,"ABC");

            System.out.println("Preparing items");

            if(items!=null){

                for(String item:items){
                    System.out.println("Item:"+item);
                }
            }
        }
        else{
            System.out.println("MenuCard is null");
        }
    }
}
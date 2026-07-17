package com.xworkz.country.runner;

import com.xworkz.country.dto.SnackDTO;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SnackRunner {
    public static void main(String[] args) {

        Set<SnackDTO> snackDTOS=new HashSet<>();
        snackDTOS.add(new SnackDTO("cake","pineapple",1,500));
        snackDTOS.add(new SnackDTO("Lays", "Classic Salted", 52.0, 20.0));
        snackDTOS.add(new SnackDTO("Kurkure", "Masala Munch", 90.0, 30.0));
        snackDTOS.add(new SnackDTO("Bingo", "Mad Angles", 70.0, 25.0));
        snackDTOS.add(new SnackDTO("Doritos", "Nacho Cheese", 80.0, 50.0));
        snackDTOS.add(new SnackDTO("Pringles", "Sour Cream & Onion", 110.0, 120.0));
        System.out.println("total size:"+snackDTOS.size());

        boolean added=snackDTOS.add( new SnackDTO("Lays", "Classic Salted", 52.0, 20.0));
        System.out.println("added:"+added);
        System.out.println("size:"+snackDTOS.size());

        boolean removed=snackDTOS.remove(new SnackDTO("Doritos", "Nacho Cheese", 80.0, 50.0));
        System.out.println("removeed:"+removed);

        boolean present=snackDTOS.contains(new SnackDTO("cake","pineapple",1,500));
        System.out.println("present:"+present);

        System.out.println("size after modiication:"+snackDTOS.size());

        //snackDTOS.clear();
        //System.out.println("total size:"+snackDTOS.size());

        System.out.println("Is Empty: " + snackDTOS.isEmpty());

        snackDTOS.forEach(e-> System.out.println(e));

        Iterator<SnackDTO> itr=snackDTOS.iterator();
        while (itr.hasNext()){
            SnackDTO snack=itr.next();
            System.out.println(snack);

            

        }



    }
}

package com.xworkz.grocery.runner;

import com.xworkz.grocery.dto.GroceryDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class GroceryRuneer {
    public static void main(String[] args) {
        List<GroceryDTO> grocery=new ArrayList<>();
        int count=0;
        grocery.add(new GroceryDTO(101,"rice","inadia gate",65.60,10,5.0,"grains",true));
        grocery.add(new GroceryDTO(102, "Wheat Flour", "Aashirvaad", 52.50, 8, 2.0, "Grains", true));
        grocery.add(new GroceryDTO(103, "Sugar", "Madhur", 45.00, 15, 1.0, "Sweetener", true));
        grocery.add(new GroceryDTO(104, "Sunflower Oil", "Fortune", 175.75, 12, 1.0, "Oil", true));
        grocery.add(new GroceryDTO(105, "Toor Dal", "Tata Sampann", 138.90, 6, 1.0, "Pulses", true));
        grocery.add(new GroceryDTO(106, "Salt", "Tata Salt", 28.50, 20, 1.0, "Spices", true));
        grocery.add(new GroceryDTO(107, "Tea Powder", "Brooke Bond Red Label", 245.00, 7, 1.0, "Beverages", true));
        GroceryDTO groceryDTO = new GroceryDTO(105, "Toor Dal", "Tata Sampann", 138.90, 6, 1.0, "Pulses", true);

        boolean contain=grocery.contains(groceryDTO);
        System.out.println("already added:"+contain);
        System.out.println("total items before add:"+grocery.size());

        grocery.add(new GroceryDTO(109, "Moong Dal", "Tata Sampann", 138.90, 6, 1.0, "Pulses", true));
        System.out.println("after add:"+grocery.size());

        grocery.addAll(grocery);

        grocery.remove(new GroceryDTO(106, "Salt", "Tata Salt", 28.50, 20, 1.0, "Spices", true));
        System.out.println("removed successfully:"+grocery.size());

        ListIterator<GroceryDTO> listIterator = grocery.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

        ListIterator<GroceryDTO> listIterator1 = grocery.listIterator();
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }

    }
}

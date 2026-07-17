package com.xworkz.country.runner;

import com.xworkz.country.dto.SnackDTO;

import java.util.*;

public class SnackRunner {
    public static void main(String[] args) {

        Set<SnackDTO> snackDTOS = new HashSet<>();
        snackDTOS.add(new SnackDTO("cake", "pineapple", 1.0, 500.0));
        snackDTOS.add(new SnackDTO("Lays", "Classic Salted", 52.0, 20.0));
        snackDTOS.add(new SnackDTO("Kurkure", "Masala Munch", 90.0, 30.0));
        snackDTOS.add(new SnackDTO("Bingo", "Mad Angles", 70.0, 25.0));
        snackDTOS.add(new SnackDTO("Doritos", "Nacho Cheese", 80.0, 50.0));
        snackDTOS.add(new SnackDTO("Pringles", "Sour Cream & Onion", 110.0, 120.0));
        System.out.println("total size:" + snackDTOS.size());

        boolean added = snackDTOS.add(new SnackDTO("Lays", "Classic Salted", 52.0, 20.0));
        System.out.println("added:" + added);
        System.out.println("size:" + snackDTOS.size());

        boolean removed = snackDTOS.remove(new SnackDTO("Doritos", "Nacho Cheese", 80.0, 50.0));
        System.out.println("removeed:" + removed);

        boolean present = snackDTOS.contains(new SnackDTO("cake", "pineapple", 1.0, 500.0));
        System.out.println("present:" + present);

        System.out.println("size after modiication:" + snackDTOS.size());

        //snackDTOS.clear();
        //System.out.println("total size:"+snackDTOS.size());

        System.out.println("Is Empty: " + snackDTOS.isEmpty());

        snackDTOS.forEach(e -> System.out.println(e));

        Iterator<SnackDTO> itr = snackDTOS.iterator();
        while (itr.hasNext()) {
            SnackDTO snack = itr.next();
            System.out.println(snack);

            snackDTOS.removeIf(snacks -> snacks.getPrice() > 50);
            System.out.println("After removeIf:");
            snackDTOS.forEach(System.out::println);

            HashSet<SnackDTO> snackDTOS1 = new HashSet<>(10);
            snackDTOS1.add(new SnackDTO("Lays", "Classic", 52.0, 20.0));
            snackDTOS1.add(new SnackDTO("Kurkure", "Masala", 90.0, 30.0));

            HashSet<SnackDTO> snackDTOS2 = new HashSet<>();
            snackDTOS2.add(new SnackDTO("Cookies", "Chocolate", 200.0, 150.0));
            snackDTOS2.add(new SnackDTO("Crackers", "Garlic", 90.0, 55.0));
            snackDTOS2.add(new SnackDTO("Peanuts", "Roasted", 250.0, 95.0));

            boolean added1 = snackDTOS.addAll(snackDTOS2);
            System.out.println("Elements added: " + added);

            boolean retained = snackDTOS.retainAll(snackDTOS2);
            System.out.println("Modified: " + retained);
            System.out.println("Size: " + snackDTOS.size());

            snackDTOS.removeAll(snackDTOS2);
            snackDTOS.forEach(System.out::println);

            boolean result = snackDTOS.containsAll(snackDTOS2);
            System.out.println(result);

            SnackDTO[] snacks = {new SnackDTO("Popcorn", "Butter", 100.0, 60.0),
                    new SnackDTO("Pretzels", "Salted", 80.0, 45.0)};

            HashSet<SnackDTO> snackSet = new HashSet<>(Arrays.asList(snacks));
            snackSet.forEach(System.out::println);

            snackSet.stream().filter(snack1 -> snack1.getPrice() < 100)
                    .forEach(System.out::println);

            //treeset

            TreeSet<SnackDTO> snacks3 = new TreeSet<>();

            snacks3.add(new SnackDTO("Murukku", "Spicy", 150.0, 80.0));
            snacks3.add(new SnackDTO("Banana Chips", "Salted", 200.0, 120.0));
            snacks3.add(new SnackDTO("Chikki", "Peanut", 250.0, 60.0));
            snacks3.add(new SnackDTO("Khakhra", "Masala", 180.0, 90.0));
            snacks3.add(new SnackDTO("Samosa", "Potato", 100.0, 30.0));
            snacks3.forEach(System.out::println);

            boolean added2 = snacks3.add(new SnackDTO("Murukku", "Spicy", 150.0, 80.0));
            System.out.println("Duplicate Added:" + added2);
            System.out.println("Size:" + snacks3.size());

            System.out.println(snacks3.first());

            System.out.println(snacks3.last());

            SortedSet<SnackDTO> head = snacks3.headSet(new SnackDTO("", "", 2.0, 90.0));
            head.forEach(System.out::println);

            SortedSet<SnackDTO> tail = snacks3.tailSet(new SnackDTO("", "", 6.0, 80.0));
            tail.forEach(s -> System.out.println(s));

            snacks3.stream().filter(snack3 -> snack3.getName().equals("Chikki"))
                    .forEach(snack3 -> System.out.println(snack3));

            System.out.println(snacks3.pollFirst());
            snacks3.forEach(snack4 -> System.out.println(snack4));

            TreeSet<SnackDTO> snacks1 = new TreeSet<>((s1, s2) -> s2.getPrice().compareTo(s1.getPrice()));


        }
    }
}

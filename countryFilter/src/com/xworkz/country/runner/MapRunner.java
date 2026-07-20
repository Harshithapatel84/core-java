package com.xworkz.country.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("harshitha","abc@123");
        map.put("riya","rf@12");
        map.put("siya","si_67");
        map.put("roshan","ro@13");
        map.put("rahul","rahul@123");
        System.out.println("total size:"+map.size());

        Set<String> keys=map.keySet();
        keys.forEach(e-> System.out.println(e));

        Collection<String> values=map.values();
        values.forEach(e-> System.out.println(e));

        System.out.println("--------------------------------------");

        Map<Integer,String> map1=new HashMap<>();
        map1.put(12,"2 members");
        map1.put(13,"abc,def,efg");
        map1.put(56,"adb,hij,klm");
        map1.put(24,"4 members");
        map1.put(42,"6 members");
        System.out.println(map1.size());

       Set<Integer> keys1=map1.keySet();
       keys1.forEach(e-> System.out.println(e));

        System.out.println(map1.values());

        System.out.println("-------------------------------");

        Map<String, String> stateMap = new HashMap<>();
        stateMap.put("Karnataka", "Siddaramaiah");
        stateMap.put("Tamil Nadu", "M. K. Stalin");
        stateMap.put("Kerala", "Pinarayi Vijayan");
        stateMap.put("Andhra Pradesh", "N. Chandrababu Naidu");
        stateMap.put("Maharashtra", "Devendra Fadnavis");
        System.out.println("Total Size: " + stateMap.size());

        stateMap.keySet().forEach(p-> System.out.println(p));

        System.out.println(stateMap.values());

        System.out.println("---------------------------------------");

        Map<String, String> movieMap = new HashMap<>();
        movieMap.put("KGF", "Yash");
        movieMap.put("Pushpa", "Allu Arjun");
        movieMap.put("RRR", "Ram Charan");
        movieMap.put("Salaar", "Prabhas");
        movieMap.put("Leo", "Vijay");
        System.out.println("Total Size: " + movieMap.size());
        Set<String> k1=movieMap.keySet();
        k1.forEach(e-> System.out.println(e));

        Collection<String> v1=movieMap.values();
        v1.forEach(e-> System.out.println(e));

        System.out.println("===============================================");

        Map<String, String> emailMap = new HashMap<>();
        emailMap.put("harshitha@gmail.com", "Harshitha");
        emailMap.put("riya@gmail.com", "Riya");
        emailMap.put("rahul@gmail.com", "Rahul");
        emailMap.put("roshan@gmail.com", "Roshan");
        emailMap.put("siya@gmail.com", "Siya");
        System.out.println("Total Size: " + emailMap.size());
        Set<String> keys2=emailMap.keySet();
        keys2.forEach(e-> System.out.println(e));

        Collection<String> values2=emailMap.values();
        values2.forEach(e-> System.out.println(e));

        Map<String, String> religionMap = new HashMap<>();
        religionMap.put("Hindu", "Shiva");
        religionMap.put("Christian", "Jesus");
        religionMap.put("Islam", "Allah");
        religionMap.put("Buddhism", "Buddha");
        religionMap.put("Sikhism", "Guru Nanak");
        System.out.println("Total Size: " + religionMap.size());
        Set<String> k3=emailMap.keySet();
        k3.forEach(e-> System.out.println(e));

        Collection<String> v3=emailMap.values();
        v3.forEach(e-> System.out.println(e));

        Map<Long, String> bankMap = new HashMap<>();
        bankMap.put(1001001001L, "Harshitha");
        bankMap.put(1001001002L, "Rahul");
        bankMap.put(1001001003L, "Riya");
        bankMap.put(1001001004L, "Roshan");
        bankMap.put(1001001005L, "Siya");
        System.out.println("Total Size: " + bankMap.size());
        Set<Long> k2=bankMap.keySet();
        k2.forEach(b-> System.out.println(b));
        bankMap.values().forEach(b-> System.out.println(b));
    }
}

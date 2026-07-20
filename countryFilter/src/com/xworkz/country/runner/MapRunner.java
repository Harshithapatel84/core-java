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




    }
}

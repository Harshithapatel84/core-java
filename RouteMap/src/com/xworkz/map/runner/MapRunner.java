package com.xworkz.map.runner;

import com.xworkz.map.dto.AreaDTO;
import com.xworkz.map.dto.HouseDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {
    public static void main(String[] args) {
        Map<AreaDTO, HouseDTO> map=new HashMap<>();
        map.put(new AreaDTO("maruthi nagar",572218,"huliyar"),new HouseDTO(34,"harshitha","Tumkur"));
        map.put(new AreaDTO("Jayanagar", 560041, "Bengaluru"), new HouseDTO(102, "Rahul", "45, Jayanagar"));
        map.put(new AreaDTO("Whitefield", 560066, "Bengaluru"), new HouseDTO(103, "Sneha", "78, Whitefield"));
        map.put(new AreaDTO("Rajajinagar", 560010, "Bengaluru"), new HouseDTO(104, "Kiran", "21, Rajajinagar"));
        map.put(new AreaDTO("BTM Layout", 560076, "Bengaluru"), new HouseDTO(105, "Anjali", "54, BTM Layout"));

        System.out.println("size:"+map.size());

        System.out.println(map.containsKey(new AreaDTO("maruthi nagar",572218,"huliyar")));

        System.out.println(map.keySet());

        System.out.println(map.values());

        System.out.println(map.entrySet());

        for (Map.Entry<AreaDTO, HouseDTO> entry:map.entrySet()) {
            System.out.println("Key:"+entry.getKey());
            System.out.println("Value:"+entry.getValue());}

        System.out.println(map.isEmpty());

        map.replace(new AreaDTO("Jayanagar", 560041, "Bengaluru"),
                new HouseDTO(202, "rohan", "Updated Address"));

        System.out.println(map.get(new AreaDTO("jayanagar", 572218, "Huliyar")));

        System.out.println(map.computeIfAbsent(new AreaDTO("Electronic City",560100,"Bengaluru"),
                key -> new HouseDTO(701,"Suresh","Electronic City")));

        map.computeIfAbsent(new AreaDTO("Whitefield",560066,"Bengaluru"),
                key -> new HouseDTO(700,"Someone","New Address"));
        System.out.println(map);

        System.out.println(map.computeIfPresent(new AreaDTO("Maruthi Nagar",572218,"Huliyar"),
                (key,value) -> new HouseDTO(800,"Harshitha Updated","Tumkur")));

        map.remove(new AreaDTO("Whitefield", 560066, "Bengaluru"));



    }

}

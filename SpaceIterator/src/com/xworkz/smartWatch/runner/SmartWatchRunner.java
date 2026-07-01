package com.xworkz.smartWatch.runner;

import com.xworkz.smartWatch.dto.SmartWatchDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SmartWatchRunner {
    public static void main(String[] args) {
        List<SmartWatchDTO> smartWatchDTOS=new ArrayList<>();
        smartWatchDTOS.add(new SmartWatchDTO("Titan", "Smart Pro X", "Black", 1.43, true, true, 10, 5999.00, "Wear OS", LocalDate.of(2024, 1, 15)));
        smartWatchDTOS.add(new SmartWatchDTO("Noise", "ColorFit Ultra", "Blue", 1.78, true, true, 7, 4499.00, "Noise OS", LocalDate.of(2023, 11, 20)));
        smartWatchDTOS.add(new SmartWatchDTO("boAt", "Wave Call", "Grey", 1.69, false, true, 5, 2499.00, "boAt OS", LocalDate.of(2023, 8, 10)));
        smartWatchDTOS.add(new SmartWatchDTO("Samsung", "Galaxy Watch 6", "Silver", 1.50, true, true, 14, 29999.00, "Wear OS", LocalDate.of(2024, 2, 5)));
        smartWatchDTOS.add(new SmartWatchDTO("Apple", "Watch Series 9", "Midnight", 1.90, true, true, 2, 45999.00, "watchOS", LocalDate.of(2024, 3, 12)));
        smartWatchDTOS.add(new SmartWatchDTO("Fire-Boltt", "Ninja Pro", "Black", 1.83, false, true, 6, 1999.00, "Fire OS", LocalDate.of(2023, 9, 18)));
        smartWatchDTOS.add(new SmartWatchDTO("Amazfit", "GTR 4", "Brown", 1.45, true, true, 12, 16999.00, "Zepp OS", LocalDate.of(2024, 5, 22)));
        smartWatchDTOS.add(new SmartWatchDTO("Fitbit", "Versa 4", "Pink", 1.58, true, true, 8, 18999.00, "Fitbit OS", LocalDate.of(2023, 12, 1)));
        smartWatchDTOS.add(new SmartWatchDTO("Huawei", "Watch GT 4", "Green", 1.43, true, true, 14, 20999.00, "HarmonyOS", LocalDate.of(2024, 4, 8)));
        smartWatchDTOS.add(new SmartWatchDTO("Realme", "Watch 3 Pro", "White", 1.78, true, true, 10, 4999.00, "Realme OS", LocalDate.of(2023, 10, 14)));
        smartWatchDTOS.add(0, new SmartWatchDTO("Titan", "Smart Pro X", "Black", 1.43, true, true, 10, 5999.00, "Wear OS", LocalDate.of(2024, 1, 15)));
        smartWatchDTOS.add(smartWatchDTOS.size(), new SmartWatchDTO("boAt", "Wave Call", "Grey", 1.69, false, true, 5, 2499.00, "boAt OS", LocalDate.of(2023, 8, 10)));
        smartWatchDTOS.add(new SmartWatchDTO("Titan", "Smart Pro X", "Black", 1.43, true, true, 10, 5999.00, "Wear OS", LocalDate.of(2024, 1, 15)));
        smartWatchDTOS.add(new SmartWatchDTO("Noise", "ColorFit Ultra", "Blue", 1.78, true, true, 7, 4499.00, "Noise OS", LocalDate.of(2023, 11, 20)));
        smartWatchDTOS.add(new SmartWatchDTO("boAt", "Wave Call", "Grey", 1.69, false, true, 5, 2499.00, "boAt OS", LocalDate.of(2023, 8, 10)));
        smartWatchDTOS.add(new SmartWatchDTO("Samsung", "Galaxy Watch 6", "Silver", 1.50, true, true, 14, 29999.00, "Wear OS", LocalDate.of(2024, 2, 5)));
        smartWatchDTOS.add(new SmartWatchDTO("Apple", "Watch Series 9", "Midnight", 1.90, true, true, 2, 45999.00, "watchOS", LocalDate.of(2024, 3, 12)));
        smartWatchDTOS.add(new SmartWatchDTO("Huawei", "Watch GT 4", "Green", 1.43, true, true, 14, 20999.00, "HarmonyOS", LocalDate.of(2024, 4, 8)));
        smartWatchDTOS.add(new SmartWatchDTO("Realme", "Watch 3 Pro", "White", 1.78, true, true, 10, 4999.00, "Realme OS", LocalDate.of(2023, 10, 14)));
        smartWatchDTOS.add(new SmartWatchDTO("Amazfit", "GTR 4", "Brown", 1.45, true, true, 12, 16999.00, "Zepp OS", LocalDate.of(2024, 5, 22)));
        smartWatchDTOS.add(new SmartWatchDTO("Garmin", "Forerunner 255", "Black", 1.30, true, true, 15, 32999.00, "Garmin OS", LocalDate.of(2024, 1, 20)));
        smartWatchDTOS.add(new SmartWatchDTO("Fitbit", "Versa 4", "Pink", 1.58, true, true, 8, 18999.00, "Fitbit OS", LocalDate.of(2023, 12, 1)));
        smartWatchDTOS.add(new SmartWatchDTO("Fire-Boltt", "Ninja Pro", "Black", 1.83, false, true, 6, 1999.00, "Fire OS", LocalDate.of(2023, 9, 18)));
        smartWatchDTOS.add(new SmartWatchDTO("Fastrack", "Reflex Vox", "Blue", 1.69, true, true, 7, 3499.00, "Reflex OS", LocalDate.of(2023, 7, 11)));
        smartWatchDTOS.add(new SmartWatchDTO("OnePlus", "Watch 2", "Emerald", 1.43, true, true, 12, 24999.00, "Wear OS", LocalDate.of(2024, 3, 1)));
        smartWatchDTOS.add(new SmartWatchDTO("Xiaomi", "Watch S3", "Silver", 1.47, true, true, 15, 15999.00, "HyperOS", LocalDate.of(2024, 2, 18)));
        smartWatchDTOS.add(new SmartWatchDTO("OPPO", "Watch Free", "Cream", 1.64, true, true, 10, 7999.00, "ColorOS Watch", LocalDate.of(2023, 6, 25)));
        smartWatchDTOS.add(new SmartWatchDTO("Vivo", "Watch 3", "Black", 1.43, true, true, 16, 18999.00, "BlueOS", LocalDate.of(2024, 1, 30)));
        smartWatchDTOS.add(new SmartWatchDTO("CrossBeats", "Orbit X", "Grey", 1.43, true, true, 9, 5999.00, "Cross OS", LocalDate.of(2023, 11, 5)));
        smartWatchDTOS.add(new SmartWatchDTO("Pebble", "Cosmos Luxe", "Gold", 1.43, false, true, 6, 2999.00, "Pebble OS", LocalDate.of(2023, 8, 28)));
        smartWatchDTOS.add(new SmartWatchDTO("Hammer", "Pulse X", "Black", 1.85, false, true, 7, 2799.00, "Hammer OS", LocalDate.of(2023, 10, 9)));
        smartWatchDTOS.add(new SmartWatchDTO("Boult", "Crown R", "Blue", 1.95, true, true, 8, 3999.00, "Boult OS", LocalDate.of(2024, 2, 10)));
        smartWatchDTOS.add(new SmartWatchDTO("Zebronics", "Drip", "Black", 1.75, false, true, 5, 2499.00, "Zeb OS", LocalDate.of(2023, 5, 19)));
        smartWatchDTOS.add(new SmartWatchDTO("Honor", "Watch GS 3", "Brown", 1.43, true, true, 14, 13999.00, "MagicOS", LocalDate.of(2023, 4, 14)));
        smartWatchDTOS.add(new SmartWatchDTO("Fossil", "Gen 6", "Smoke", 1.28, true, true, 2, 22999.00, "Wear OS", LocalDate.of(2023, 3, 21)));
        smartWatchDTOS.add(new SmartWatchDTO("Casio", "G-Shock GSW-H1000", "Red", 1.20, true, true, 3, 49999.00, "Wear OS", LocalDate.of(2022, 12, 5)));
        smartWatchDTOS.add(new SmartWatchDTO("Suunto", "9 Peak Pro", "Titanium", 1.20, true, true, 21, 54999.00, "Suunto OS", LocalDate.of(2024, 6, 15)));

        List<SmartWatchDTO> smartWatchDTOS1=new ArrayList<>();
        smartWatchDTOS1.add(new SmartWatchDTO("Titan", "Smart Pro X", "Black", 1.43, true, true, 10, 5999, "Wear OS", LocalDate.of(2024,1,15)));
        smartWatchDTOS1.add(new SmartWatchDTO("Noise", "ColorFit Ultra", "Blue", 1.78, true, true, 7, 4499, "Noise OS", LocalDate.of(2023,11,20)));
        smartWatchDTOS1.add(new SmartWatchDTO("boAt", "Wave Call", "Grey", 1.69, false, true, 5, 2499, "boAt OS", LocalDate.of(2023,8,10)));
        smartWatchDTOS.addAll(smartWatchDTOS1);
        System.out.println("total addition:"+smartWatchDTOS.size());

        List<SmartWatchDTO> smartWatchDTOS2=new ArrayList<>();
        smartWatchDTOS2.add(new SmartWatchDTO("Huawei", "Watch GT 4", "Green", 1.43, true, true, 14, 20999, "HarmonyOS", LocalDate.of(2024,4,8)));
        smartWatchDTOS2.add(new SmartWatchDTO("Realme", "Watch 3 Pro", "White", 1.78, true, true, 10, 4999, "Realme OS", LocalDate.of(2023,10,14)));
        smartWatchDTOS.addAll(2, smartWatchDTOS2);
        System.out.println("adding at the specific index:"+smartWatchDTOS.size());

        smartWatchDTOS.add(new SmartWatchDTO("Amazfit", "GTR 4", "Brown", 1.45, true, true, 12, 16999, "Zepp OS", LocalDate.of(2024,5,22)));
        smartWatchDTOS.add(new SmartWatchDTO("Garmin", "Forerunner 255", "Black", 1.30, true, true, 15, 32999, "Garmin OS", LocalDate.of(2024,1,20)));
        smartWatchDTOS.addAll(smartWatchDTOS);
        System.out.println("gps enabled list"+smartWatchDTOS.size());

        List<SmartWatchDTO> combineList = new ArrayList<>();
        combineList.addAll(smartWatchDTOS1);
        combineList.addAll(smartWatchDTOS2);
        System.out.println("combined list:"+combineList.size());

      SmartWatchDTO smartWatchDTO=new SmartWatchDTO("Apple", "Watch Series 9", "Midnight", 1.90, true, true, 2, 45999.00, "watchOS", LocalDate.of(2024, 3, 12));
      boolean contain=smartWatchDTOS.contains(smartWatchDTO);
        System.out.println("contain:"+contain);

        SmartWatchDTO watch2 = new SmartWatchDTO("Titan", "Smart Pro X", "Black", 1.43, true, true, 10, 5999.00, "Wear OS", LocalDate.of(2024, 1, 15));
        boolean contains2 = smartWatchDTOS.contains(watch2);
        System.out.println("Contains Black watch: " + contains2);

        boolean found=false;
        for(SmartWatchDTO watch:smartWatchDTOS)
        {
            if(watch.getPrice()>50000)
            {
                found=true;
            }
            System.out.println("exist:"+found);
        }

        //remove
        SmartWatchDTO watch = new SmartWatchDTO("Apple", "Watch Series 9", "Midnight", 1.90, true, true, 2, 45999.00, "watchOS", LocalDate.of(2024, 3, 12));
        smartWatchDTOS.remove(watch);
        System.out.println("After removing Apple Watch: " + smartWatchDTOS.size());

        smartWatchDTOS.remove(0);
        System.out.println("removing first watch: " + smartWatchDTOS);

        smartWatchDTOS.remove(smartWatchDTOS.size() - 1);
        System.out.println("After removing last watch: " + smartWatchDTOS);

        smartWatchDTOS.remove(2);
        System.out.println("After removing watch at index 5: " + smartWatchDTOS);

        SmartWatchDTO samsungWatch = new SmartWatchDTO("Samsung", "Galaxy Watch 6", "Silver", 1.50, true, true, 14, 29999.00, "Wear OS", LocalDate.of(2024, 2, 5));
        smartWatchDTOS.remove(samsungWatch);
        System.out.println("After removing Samsung watch: " + smartWatchDTOS);







    }
}

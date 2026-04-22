package com.xworkz.method.school;

public class School {
    public static void main(String[] args) {
        String name="vasavi";
        String name2=new String("vasavi");

        String newName=name.toUpperCase();
        System.out.println(newName);

        String concate=name.concat(  "high school");
        System.out.println(concate);

        String code="Hs04";
        String code1 = code.replace("Hs","Kp");
        System.out.println(code1);

        String city="   bangalore    ";
        String code2=city.trim();
        System.out.println(code2);

        int len=city.length();
        System.out.println(len);

        String town="Mysore";
        System.out.println(town.indexOf("o"));

        String town1=town.toLowerCase();
        System.out.println(town1);

        String town2=String.valueOf(town.contains("so"));
        System.out.println(town2);

        System.out.println(name==name2);
        System.out.println(name.equals(name2));





    }
}

package com.xworkz.method.primitive;

public class College {
    public static void main(String[] args) {
        String name="Dayanand ";

       String name1=String.valueOf(name.length());
        System.out.println(name1);

        String name2=String.valueOf(name.indexOf("sa"));
        System.out.println(name2);

        String name3=String.valueOf(name.charAt(4));
        System.out.println(name3);

        String name4=String.join(" ","sarvodaya", "pre","university");
        System.out.println(name4);

        String name5=String.format("price %d",65);
        System.out.println(name5);

        String nm="harshitha";
        int age=21;
        String nm1=String.format("name: %s,age:%d",name,age);
        System.out.println(nm1);

        String sub="cloud computing";
        String sub1=String.valueOf(sub.startsWith("co"));
        System.out.println(sub1);

        String town="MYSORE";
        String town4=String.valueOf(town.equalsIgnoreCase("mysore"));
        System.out.println(town4);




    }
}

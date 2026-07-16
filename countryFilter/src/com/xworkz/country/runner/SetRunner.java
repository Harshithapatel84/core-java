package com.xworkz.country.runner;

import java.util.HashSet;
import java.util.Set;

public class SetRunner {

    public static void main(String[] args) {
        Set<String> runner=new HashSet<String>();
        runner.add("harshitha");
        runner.add("kiara");
        runner.add("siya");
        runner.add("riya");
        runner.add("rahul");
        runner.add("praveen");
        runner.add("siya");

        System.out.println("total size is:"+runner.size());
        runner.forEach(r-> System.out.println(r));

    }
}

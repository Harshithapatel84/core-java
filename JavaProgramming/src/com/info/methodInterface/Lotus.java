package com.info.methodInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Lotus {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        LocalDate localDate1=LocalDate.ofYearDay(2004,56);
        System.out.println(localDate1);

        LocalDate localDate2=LocalDate.of(2026,05,06);
        System.out.println(localDate2);

        LocalDate localDate3 = LocalDate.ofEpochDay(150);
        System.out.println(localDate3);

        LocalDate localDate4 = LocalDate.now().plusDays(10);
        System.out.println(localDate4);

        LocalDate localDate5=LocalDate.MAX;
        System.out.println(localDate5);

        LocalDate localDate6=LocalDate.parse("2025-06-18");
        System.out.println(localDate6);

        System.out.println(LocalDate.from(LocalDate.now()));

        System.out.println(LocalTime.ofSecondOfDay(2300));

        System.out.println(LocalDate.now().lengthOfYear());

        System.out.println(LocalDate.now().isLeapYear());

    }



}

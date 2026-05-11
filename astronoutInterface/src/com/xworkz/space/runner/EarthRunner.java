package com.xworkz.space.runner;

import com.xworkz.space.apartment.Apartment;
import com.xworkz.space.apartment.impl.ApartmentImpl;
import com.xworkz.space.cloud.Cloud;
import com.xworkz.space.cloud.impl.CloudImpl;
import com.xworkz.space.exam.CivilExam;
import com.xworkz.space.exam.impl.CivilExamImpl;
import com.xworkz.space.license.License;
import com.xworkz.space.license.impl.LicenseImpl;
import com.xworkz.space.satellite.Earth;
import com.xworkz.space.satellite.impl.EarthImpl;

public class EarthRunner {
    public static void main(String[] args) {
        Earth earth=new EarthImpl();
        earth.rotate();
        earth.revolve();
        earth.supportLife();
        earth.action();
        earth.live();
        Earth.printInfo();
        System.out.println("distance ffro moon:"+Earth.distanceFromMoon);
        System.out.println("earth occupies"+Earth.order+"position");

        System.out.println("=========================================================");

        License license = new LicenseImpl();
        license.apply();
        license.renew();
        license.verify();
        license.rules();
        License.authority();

        System.out.println(License.type);
        System.out.println(License.validityYears);

        System.out.println("=========================================================");

        Apartment obj = new ApartmentImpl();
        obj.rent();
        obj.buy();
        obj.maintain();
        obj.facilities();
        obj.occupy();
        Apartment.locationInfo();

        System.out.println(Apartment.name);
        System.out.println(Apartment.floors);

        System.out.println("===============================================");

        CivilExam exam = new CivilExamImpl();

        exam.apply();
        exam.prepare();
        exam.writeExam();
        exam.write();
        exam.read();
        CivilExam.examInfo();
        System.out.println("Exam Name: " + CivilExam.examName);
        System.out.println("Attempts Allowed: " + CivilExam.attempts);

        Cloud cloud=new CloudImpl();
        cloud.rain();
        cloud.smooky();
        cloud.sky();
        cloud.climate();
        cloud.shade();
        Cloud.info();
        System.out.println("cloud color:"+Cloud.color);
        System.out.println("cloud layers:"+Cloud.layer);
        System.out.println("cloud height:"+Cloud.height);



    }
}

package com.book.implementation.hospital;

public class Doctor {
    private Hospital hospital;

    public Doctor(Hospital hospital)
    {
        this.hospital=hospital;
    }
    public void appointment()
    {
        if(this.hospital!=null)
        {
            this.hospital.treatment();
            System.out.println("book an appoinment for treatment");
        }
    }
}

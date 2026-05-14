package com.book.implementation.hospital.impl;

import com.book.implementation.hospital.Hospital;

public class AppoloHospital implements Hospital {
    @Override
    public void treatment() {
        System.out.println("treat patients...");
    }
}

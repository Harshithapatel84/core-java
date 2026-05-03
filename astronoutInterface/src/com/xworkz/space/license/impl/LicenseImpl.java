package com.xworkz.space.license.impl;

import com.xworkz.space.license.License;

public class LicenseImpl implements License {

    @Override
    public void apply() {
        System.out.println("Applying for license");
    }
    public void renew() {
        System.out.println("Renewing the license");
    }

    @Override
    public void verify() {
        System.out.println("Verifying license details");
    }
}
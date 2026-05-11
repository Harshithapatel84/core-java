package com.xworkz.space.cloud.impl;

import com.xworkz.space.cloud.Cloud;

public class CloudImpl implements Cloud {

    @Override
    public void rain() {
        System.out.println("Predict rain from cloud.....");
    }

    @Override
    public void smooky() {
        System.out.println("smooky clouds");
    }

    @Override
    public void sky() {
        System.out.println("execute the sky in the cloud");
    }


}

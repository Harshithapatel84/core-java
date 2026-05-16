package com.apln.garbage.dto;

import com.apln.garbage.constant.GarbageType;

import java.io.Serializable;

public class GarbageDTO implements Serializable {
    private GarbageType garbageType;
    private int Quantity;
    private String address;
}

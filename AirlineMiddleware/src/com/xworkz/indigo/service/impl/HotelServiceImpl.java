package com.xworkz.indigo.service.impl;

import com.xworkz.indigo.dao.HotelSearchDAO;
import com.xworkz.indigo.dto.HotelSearchDTO;
import com.xworkz.indigo.service.HotelService;


public class HotelServiceImpl implements HotelService {
    private HotelSearchDAO hotelSearchDAO;
    public HotelServiceImpl(HotelSearchDAO hotelSearchDAO)
    {
        this.hotelSearchDAO=hotelSearchDAO;
    }
    @Override
    public boolean validatAndSave(HotelSearchDTO detailDto) {
        System.out.println("validate and search for hotel");
        if(this.hotelSearchDAO!=null)
        {
            System.out.println("hotel is not null...");
            return  true;
        }
        else {
            System.out.println("hotel detail is null...");
        }
        return false;
    }
}

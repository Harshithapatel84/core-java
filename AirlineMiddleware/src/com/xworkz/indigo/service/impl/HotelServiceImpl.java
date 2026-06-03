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
    public boolean validatAndSearch(HotelSearchDTO detailDto) {
        System.out.println("validate and search for hotel");
        if(this.hotelSearchDAO!=null)
        {
            System.out.println("hotel is not null...");
        }
        else {
            System.out.println("hotel detail is null...");
            return  false;
        }
        if(detailDto!=null)
        {
            System.out.println("dto is not null");
        }
        else {
            System.out.println("dto is null");
            return false;
        }
        return hotelSearchDAO.search(detailDto);

    }
}

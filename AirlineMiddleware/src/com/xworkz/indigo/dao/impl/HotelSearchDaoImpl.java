package com.xworkz.indigo.dao.impl;

import com.xworkz.indigo.dao.HotelSearchDAO;
import com.xworkz.indigo.dto.HotelSearchDTO;

public class HotelSearchDaoImpl implements HotelSearchDAO {
    @Override
    public boolean search(HotelSearchDTO detailDto) {
        System.out.println("searching hotekl...:"+detailDto);
        return true;
    }
}

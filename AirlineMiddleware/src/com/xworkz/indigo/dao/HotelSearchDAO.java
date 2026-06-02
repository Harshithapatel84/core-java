package com.xworkz.indigo.dao;

import com.xworkz.indigo.dto.HotelSearchDTO;

public interface HotelSearchDAO {
    boolean search(HotelSearchDTO detailDto);
}

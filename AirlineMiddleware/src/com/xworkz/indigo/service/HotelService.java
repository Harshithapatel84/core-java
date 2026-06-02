package com.xworkz.indigo.service;

import com.xworkz.indigo.dto.HotelSearchDTO;

public interface HotelService {
    boolean validatAndSave(HotelSearchDTO detailDto);
}

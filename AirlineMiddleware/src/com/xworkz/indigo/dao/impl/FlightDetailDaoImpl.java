package com.xworkz.indigo.dao.impl;

import com.xworkz.indigo.dao.FlightDetailDAO;
import com.xworkz.indigo.dto.FlightDetailDTO;

public class FlightDetailDaoImpl implements FlightDetailDAO {
    @Override
    public boolean search(FlightDetailDTO detailDTO) {
        System.out.println("searching  flight details:"+detailDTO);
        return true;

    }
}

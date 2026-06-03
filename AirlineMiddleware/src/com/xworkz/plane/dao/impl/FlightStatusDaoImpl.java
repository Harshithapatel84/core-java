package com.xworkz.plane.dao.impl;

import com.xworkz.plane.dao.FlightStatusDAO;
import com.xworkz.plane.dto.FlightStatusDTO;

public class FlightStatusDaoImpl implements FlightStatusDAO {
    @Override
    public boolean statusCheck(FlightStatusDTO statusDTO) {
        System.out.println("flight status details:"+statusDTO);

        return true;
    }
}

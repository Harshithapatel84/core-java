package com.xworkz.plane.dao;

import com.xworkz.plane.dto.FlightStatusDTO;

public interface FlightStatusDAO {
    boolean statusCheck(FlightStatusDTO statusDTO);

}

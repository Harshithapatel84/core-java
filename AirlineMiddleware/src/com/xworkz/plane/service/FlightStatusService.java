package com.xworkz.plane.service;

import com.xworkz.plane.dto.FlightStatusDTO;

public interface FlightStatusService {
    boolean validatAndGetStatus(FlightStatusDTO statusDTO);
}

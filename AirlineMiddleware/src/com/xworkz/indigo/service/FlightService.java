package com.xworkz.indigo.service;

import com.xworkz.indigo.dto.FlightDetailDTO;

public interface FlightService {
    boolean validateAndSave(FlightDetailDTO detailDTO);
}

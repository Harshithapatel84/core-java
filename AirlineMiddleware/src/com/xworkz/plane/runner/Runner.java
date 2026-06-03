package com.xworkz.plane.runner;

import com.xworkz.plane.dao.FlightStatusDAO;
import com.xworkz.plane.dao.impl.FlightStatusDaoImpl;
import com.xworkz.plane.dto.FlightStatusDTO;
import com.xworkz.plane.service.FlightStatusService;
import com.xworkz.plane.service.impl.FlightStatusServiceImpl;

public class Runner {
    public static void main(String[] args) {
        FlightStatusDAO flightStatusDAO=new FlightStatusDaoImpl();
        FlightStatusDTO flightStatusDTO=new FlightStatusDTO();
        FlightStatusService flightStatusService=new FlightStatusServiceImpl(flightStatusDAO);
        flightStatusService.validatAndGetStatus(flightStatusDTO);

    }
}

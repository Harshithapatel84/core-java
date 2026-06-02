package com.xworkz.indigo.runner;

import com.xworkz.indigo.dao.FlightDetailDAO;
import com.xworkz.indigo.dao.impl.FlightDetailDaoImpl;
import com.xworkz.indigo.dto.FlightDetailDTO;
import com.xworkz.indigo.service.FlightService;
import com.xworkz.indigo.service.impl.FlightServiceImpl;

public class Runner {
    public static void main(String[] args) {
        FlightDetailDAO flightDetailDAO=new FlightDetailDaoImpl();
        FlightDetailDTO flightDetailDTO=new FlightDetailDTO();
        FlightService flightService=new FlightServiceImpl(flightDetailDAO);
        flightService.validateAndSave(flightDetailDTO);
    }
}

package com.xworkz.indigo.runner;

import com.xworkz.indigo.dao.FlightDetailDAO;
import com.xworkz.indigo.dao.HotelSearchDAO;
import com.xworkz.indigo.dao.impl.FlightDetailDaoImpl;
import com.xworkz.indigo.dao.impl.HotelSearchDaoImpl;
import com.xworkz.indigo.dto.FlightDetailDTO;
import com.xworkz.indigo.dto.HotelSearchDTO;
import com.xworkz.indigo.service.FlightService;
import com.xworkz.indigo.service.HotelService;
import com.xworkz.indigo.service.impl.FlightServiceImpl;
import com.xworkz.indigo.service.impl.HotelServiceImpl;

public class Runner {
    public static void main(String[] args) {
        FlightDetailDAO flightDetailDAO=new FlightDetailDaoImpl();
        FlightDetailDTO flightDetailDTO=new FlightDetailDTO();
        FlightService flightService=new FlightServiceImpl(flightDetailDAO);
        flightService.validateAndSave(flightDetailDTO);

        HotelSearchDAO hotelSearchDAO=new HotelSearchDaoImpl();
        HotelSearchDTO hotelSearchDTO=new HotelSearchDTO();
        HotelService hotelService=new HotelServiceImpl(hotelSearchDAO);
        boolean store=hotelService.validatAndSave(hotelSearchDTO);
        System.out.println("search:"+store);
    }
}

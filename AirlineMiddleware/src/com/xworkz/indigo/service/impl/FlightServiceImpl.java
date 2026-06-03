package com.xworkz.indigo.service.impl;

import com.xworkz.indigo.dao.FlightDetailDAO;
import com.xworkz.indigo.dto.FlightDetailDTO;
import com.xworkz.indigo.service.FlightService;

public class FlightServiceImpl implements FlightService {
    private FlightDetailDAO flightDetailDAO;
    public FlightServiceImpl( FlightDetailDAO flightDetailDAO)
    {
        this.flightDetailDAO=flightDetailDAO;
    }
    @Override
    public boolean validateAndSearch(FlightDetailDTO detailDTO) {
        if(this.flightDetailDAO!=null)
        {
            System.out.println("flight is not null...");
        }
        else {
            System.out.println("detail is null,cannot search");
            return false;
        }
        if(detailDTO!=null)
        {
            System.out.println("flight dto is not null");
        }
        else {
            System.out.println("dto is null");
        }
        return flightDetailDAO.search(detailDTO);
    }
}

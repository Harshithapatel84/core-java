package com.xworkz.plane.service.impl;

import com.xworkz.plane.dao.FlightStatusDAO;
import com.xworkz.plane.dto.FlightStatusDTO;
import com.xworkz.plane.service.FlightStatusService;

import java.util.Objects;

public class FlightStatusServiceImpl implements FlightStatusService {
    private FlightStatusDAO flightStatusDAO;
    public FlightStatusServiceImpl(FlightStatusDAO flightStatusDAO)
    {
        this.flightStatusDAO=flightStatusDAO;
    }
    @Override
    public boolean validatAndGetStatus(FlightStatusDTO statusDTO) {
        System.out.println("validate and status chech in flight ...");
        if(Objects.nonNull(this.flightStatusDAO))
        {
            System.out.println("flight dao is not null");
        }
        else{
            System.out.println("dao is null");
            return  false;
        }

        if(Objects.nonNull(statusDTO))
        {
            System.out.println("dto is not null");
        }
        else{
            System.out.println("dto is null");
            return  false;
        }
        return this.flightStatusDAO.statusCheck(statusDTO);
    }
}

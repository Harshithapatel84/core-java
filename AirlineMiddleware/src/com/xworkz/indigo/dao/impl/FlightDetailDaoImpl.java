package com.xworkz.indigo.dao.impl;

import com.xworkz.indigo.dao.FlightDetailDAO;
import com.xworkz.indigo.dto.FlightDetailDTO;

public class FlightDetailDaoImpl implements FlightDetailDAO {
    @Override
    public boolean search(FlightDetailDTO detailDTO) {
        System.out.println("searching  flight details....");
        if(detailDTO!=null)
        {
            System.out.println("flight detail is not null..");
            return true;
        }
        else{
            System.out.println("null....");
        }
        return false;
    }
}

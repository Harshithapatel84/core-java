package com.xworkz.airIndia.service.impl;

import com.xworkz.airIndia.dao.CabSearchDAO;
import com.xworkz.airIndia.dto.CabSearchDTO;
import com.xworkz.airIndia.service.CabSearchService;

public class CabSearchServiceImpl implements CabSearchService {
    private CabSearchDAO cabSearchDAO;
    public CabSearchServiceImpl(CabSearchDAO cabSearchDAO)
    {
        this.cabSearchDAO=cabSearchDAO;
    }
    @Override
    public boolean validateAndSearch(CabSearchDTO searchDTO) {
        System.out.println("validate and searching...");
        if(this.cabSearchDAO!=null)
        {
            System.out.println("search detail is not null");
        }
        else {
            System.out.println(" search dao is null.");
            return false;
        }
        if(searchDTO!=null)
        {
            System.out.println("dto is not null");
        }
        else{
            System.out.println("dto is null");
            return false;
        }
        return cabSearchDAO.search(searchDTO);

    }
}

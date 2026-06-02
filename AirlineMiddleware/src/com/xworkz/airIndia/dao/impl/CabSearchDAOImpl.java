package com.xworkz.airIndia.dao.impl;

import com.xworkz.airIndia.dao.CabSearchDAO;
import com.xworkz.airIndia.dto.CabSearchDTO;

public class CabSearchDAOImpl implements CabSearchDAO {
    @Override
    public boolean search(CabSearchDTO searchDTO) {
        System.out.println("searching cab..");
        if(searchDTO!=null)
        {
            System.out.println("dto is not null");
        }
        return false;
    }
}

package com.xworkz.airIndia.runner;

import com.xworkz.airIndia.dao.CabSearchDAO;
import com.xworkz.airIndia.dao.impl.CabSearchDAOImpl;
import com.xworkz.airIndia.dto.CabSearchDTO;
import com.xworkz.airIndia.service.CabSearchService;
import com.xworkz.airIndia.service.impl.CabSearchServiceImpl;

public class Runner {
    public static void main(String[] args) {
        CabSearchDAO cabSearchDAO=new CabSearchDAOImpl();
        CabSearchDTO cabSearchDTO=new CabSearchDTO();
        CabSearchService cabSearchService=new CabSearchServiceImpl(cabSearchDAO);
        cabSearchService.validateAndSave(cabSearchDTO);
    }
}

package com.xworkz.service.impl;

import com.xworkz.dto.InvestmentDetailDTO;
import com.xworkz.service.InvestmentDetailService;

public class InvestmentDetailServiceImpl implements InvestmentDetailService {


    @Override
    public boolean validateAndSave(InvestmentDetailDTO detailDto)
    {
        System.out.println("data saved"+detailDto);
        return false;
    }
}

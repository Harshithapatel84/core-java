package com.xworkz.runner;

import com.xworkz.dto.InvestmentDetailDTO;
import com.xworkz.service.InvestmentDetailService;
import com.xworkz.service.impl.InvestmentDetailServiceImpl;

public class Runner {
    public static void main(String[] args) {
        InvestmentDetailService investmentDetailService=new InvestmentDetailServiceImpl();
        InvestmentDetailDTO investmentDetailDTO=new InvestmentDetailDTO("harshitha","tumkur",786589654L,6.50,10.0);
        investmentDetailService.validateAndSave(investmentDetailDTO);

    }
}

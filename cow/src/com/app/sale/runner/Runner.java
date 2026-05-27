package com.app.sale.runner;

import com.app.sale.dto.SalesDetailDTO;
import com.app.sale.service.SalesDetailService;
import com.app.sale.service.impl.SalesDetailServiceImpl;

public class Runner {
    public static void main(String[] args) {
        SalesDetailService salesDetailService=new SalesDetailServiceImpl();
        SalesDetailDTO salesDetailDTO=new SalesDetailDTO("rohith","bike",56000.0,2,"vehicle");
        salesDetailService.validateAndSave(salesDetailDTO);
    }
}

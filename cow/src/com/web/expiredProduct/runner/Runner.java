package com.web.expiredProduct.runner;

import com.web.expiredProduct.dto.ExpiredProductDetailDTO;
import com.web.expiredProduct.service.ExpiredProductDetailService;
import com.web.expiredProduct.service.impl.ExpiredProductDetailServiceImpl;

public class Runner {
    public static void main(String[] args) {
        ExpiredProductDetailService expiredProductDetailService=new ExpiredProductDetailServiceImpl();
        ExpiredProductDetailDTO expiredProductDetailDTO=new ExpiredProductDetailDTO("dolo tablet","12-05-2022",
             45,50.0,"14-05-2026");
        expiredProductDetailService.validateAndSave(expiredProductDetailDTO);
    }
}

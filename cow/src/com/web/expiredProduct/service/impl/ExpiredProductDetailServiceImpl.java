package com.web.expiredProduct.service.impl;

import com.web.expiredProduct.dto.ExpiredProductDetailDTO;
import com.web.expiredProduct.service.ExpiredProductDetailService;

public class ExpiredProductDetailServiceImpl implements ExpiredProductDetailService {
    @Override
    public boolean validateAndSave(ExpiredProductDetailDTO detailDTO) {
        System.out.println("save validate values:"+detailDTO);
        String productName=detailDTO.getProductName();
        if(productName!=null && productName.length()>=2 && productName.length()<=100)
        {
            System.out.println("valid name");
        }
        else{
            System.out.println("invalid name");
        }
        if(detailDTO.getProductId()!=null && detailDTO.getProductId()>=3 && detailDTO.getProductId()<=60)
        {
            System.out.println("valid id");
        }
        else {
            System.out.println("invalid");
        }

            return false;
    }
}

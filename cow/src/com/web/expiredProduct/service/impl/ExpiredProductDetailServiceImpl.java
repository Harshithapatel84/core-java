package com.web.expiredProduct.service.impl;

import com.web.expiredProduct.dto.ExpiredProductDetailDTO;
import com.web.expiredProduct.service.ExpiredProductDetailService;

public class ExpiredProductDetailServiceImpl implements ExpiredProductDetailService {
    @Override
    public boolean validateAndSave(ExpiredProductDetailDTO detailDTO) {
        System.out.println("data entered:"+detailDTO);
        return false;
    }
}

package com.product.service.impl;

import com.product.dto.DamageProductDetailDTO;
import com.product.service.DamageProductDetailService;

public class DamageProductDetailServiceImpl implements DamageProductDetailService {
    @Override
    public boolean validateAndSave(DamageProductDetailDTO detailDTO) {
        System.out.println("validate and save data:"+detailDTO);
        if(detailDTO.getPrName()!=null && detailDTO.getPrName().length()>=3 && detailDTO.getPrName().length()<=100)
        {
            System.out.println("valid name");
        }
        else {
            System.out.println("invalid");
        }
            return false;
    }
}

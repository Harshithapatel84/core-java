package com.product.service.impl;

import com.product.dao.ProductDetailDAO;
import com.product.dto.DamageProductDetailDTO;
import com.product.service.DamageProductDetailService;

public class DamageProductDetailServiceImpl implements DamageProductDetailService {
    private ProductDetailDAO productDetailDAO;
    public DamageProductDetailServiceImpl(ProductDetailDAO productDetailDAO)
    {
        this.productDetailDAO=productDetailDAO;
    }
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
        if(this.productDetailDAO!=null)
        {
            System.out.println("product detail is not null save.....");
            this.productDetailDAO.save(detailDTO);
        }
            return false;
    }
}

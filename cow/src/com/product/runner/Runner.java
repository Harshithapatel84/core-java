package com.product.runner;

import com.product.dao.ProductDetailDAO;
import com.product.dao.impl.ProductDetailDAOImpl;
import com.product.dto.DamageProductDetailDTO;
import com.product.service.DamageProductDetailService;
import com.product.service.impl.DamageProductDetailServiceImpl;

public class Runner {
    public static void main(String[] args) {

        ProductDetailDAO productDetailDAO=new ProductDetailDAOImpl();
        DamageProductDetailService damageProductDetailService=new DamageProductDetailServiceImpl(productDetailDAO);
        DamageProductDetailDTO damageProductDetailDTO=new DamageProductDetailDTO("tab","lenovo",56000.0,
                "screen",2);
        damageProductDetailService.validateAndSave(damageProductDetailDTO);
    }
}

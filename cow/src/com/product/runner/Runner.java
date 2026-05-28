package com.product.runner;

import com.product.dto.DamageProductDetailDTO;
import com.product.service.DamageProductDetailService;
import com.product.service.impl.DamageProductDetailServiceImpl;

public class Runner {
    public static void main(String[] args) {
        DamageProductDetailService damageProductDetailService=new DamageProductDetailServiceImpl();
        DamageProductDetailDTO damageProductDetailDTO=new DamageProductDetailDTO("tab","lenovo",56000.0,
                "screen",2);
        damageProductDetailService.validateAndSave(damageProductDetailDTO);
    }
}

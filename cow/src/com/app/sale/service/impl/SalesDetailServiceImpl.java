package com.app.sale.service.impl;

import com.app.sale.dto.SalesDetailDTO;
import com.app.sale.service.SalesDetailService;

public class SalesDetailServiceImpl  implements SalesDetailService {

    @Override
    public boolean validateAndSave(SalesDetailDTO detailDTO) {
        System.out.println("data preserved:"+detailDTO);
        return false;
    }
}

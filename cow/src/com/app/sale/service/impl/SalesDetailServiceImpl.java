package com.app.sale.service.impl;

import com.app.sale.dto.SalesDetailDTO;
import com.app.sale.service.SalesDetailService;

public class SalesDetailServiceImpl  implements SalesDetailService {

    @Override
    public boolean validateAndSave(SalesDetailDTO detailDTO) {
        System.out.println("data preserved:"+detailDTO);
        String SallerName= detailDTO.getSallername();
        if(SallerName!=null && SallerName.length()>=3 && SallerName.length()<=80 && SallerName.matches("[a-zA-Z .]+"))
        {
            System.out.println("valid name");
        }
        else{
            System.out.println("invalid");
        }
        return false;
    }
}

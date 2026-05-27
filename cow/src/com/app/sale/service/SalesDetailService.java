package com.app.sale.service;

import com.app.sale.dto.SalesDetailDTO;

public interface SalesDetailService {

    public boolean validateAndSave(SalesDetailDTO detailDTO);
}

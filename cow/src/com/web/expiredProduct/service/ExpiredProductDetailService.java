package com.web.expiredProduct.service;

import com.web.expiredProduct.dto.ExpiredProductDetailDTO;

public interface ExpiredProductDetailService
{
    public boolean validateAndSave(ExpiredProductDetailDTO detailDTO);
}

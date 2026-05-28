package com.product.service;

import com.product.dto.DamageProductDetailDTO;

public interface DamageProductDetailService {
    public boolean validateAndSave(DamageProductDetailDTO detailDTO);
}

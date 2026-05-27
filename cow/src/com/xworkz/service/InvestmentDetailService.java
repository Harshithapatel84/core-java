package com.xworkz.service;

import com.xworkz.dto.InvestmentDetailDTO;

public interface InvestmentDetailService {

    public boolean validateAndSave(InvestmentDetailDTO detailDto);
}

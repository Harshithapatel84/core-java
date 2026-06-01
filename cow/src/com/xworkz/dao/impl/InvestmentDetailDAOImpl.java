package com.xworkz.dao.impl;

import com.xworkz.dao.InvestmentdetailDAO;
import com.xworkz.dto.InvestmentDetailDTO;

public class InvestmentDetailDAOImpl implements InvestmentdetailDAO {
    @Override
    public void save(InvestmentDetailDTO detailDTO) {
        System.out.println("saving the data.....");
    }
}

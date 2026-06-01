package com.app.sale.dao.impl;

import com.app.sale.dao.SaleDetailDAO;
import com.app.sale.dto.SalesDetailDTO;

public class SaleDetailDaoImpl implements SaleDetailDAO {
    @Override
    public void store(SalesDetailDTO detailDTO) {
        System.out.println("saving the data...");
    }
}

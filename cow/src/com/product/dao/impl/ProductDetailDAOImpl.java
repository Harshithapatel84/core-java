package com.product.dao.impl;

import com.product.dao.ProductDetailDAO;
import com.product.dto.DamageProductDetailDTO;

public class ProductDetailDAOImpl implements ProductDetailDAO {
    @Override
    public void save(DamageProductDetailDTO detailDTO) {
        System.out.println("saving data.....");
    }
}

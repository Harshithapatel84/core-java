package com.academy.order.dao.impl;

import com.academy.order.dao.OrderDetailDAO;
import com.academy.order.dto.OrderDetailDTO;

public class OrderDetailDaoImpl implements OrderDetailDAO {
    @Override
    public void save(OrderDetailDTO detailDTO) {
        System.out.println("saving the data.....");
    }
}

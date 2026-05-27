package com.academy.order.service.impl;

import com.academy.order.dto.OrderDetailDTO;
import com.academy.order.service.OrderDetailService;

public class OrderDetailServiceImpl implements OrderDetailService {
    @Override
    public boolean validateAndSaqve(OrderDetailDTO detailDTO) {
        System.out.println("data stored:"+detailDTO);
        return false;
    }
}

package com.academy.order.runner;

import com.academy.order.dto.OrderDetailDTO;
import com.academy.order.service.OrderDetailService;
import com.academy.order.service.impl.OrderDetailServiceImpl;

public class Runner {
    public static void main(String[] args) {
        OrderDetailService orderDetailService=new OrderDetailServiceImpl();
        OrderDetailDTO orderDetailDTO=new OrderDetailDTO("online order","cloth",578.0,"bangalore",532);
        orderDetailService.validateAndSaqve(orderDetailDTO);
    }
}



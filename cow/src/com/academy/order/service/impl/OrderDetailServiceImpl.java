package com.academy.order.service.impl;

import com.academy.order.dao.OrderDetailDAO;
import com.academy.order.dto.OrderDetailDTO;
import com.academy.order.service.OrderDetailService;

public class OrderDetailServiceImpl implements OrderDetailService {
    private OrderDetailDAO orderDetailDAO;
    public OrderDetailServiceImpl(OrderDetailDAO orderDetailDAO)
    {
        this.orderDetailDAO=orderDetailDAO;
    }
    @Override
    public boolean validateAndSaqve(OrderDetailDTO detailDTO) {
        System.out.println("validate and save data :"+detailDTO);
        if(detailDTO.getItem()!=null && detailDTO.getItem().length()>=4 &&  detailDTO.getItem().length()<=60)
        {
            System.out.println("valid item name");
        }
        else
        {
            System.out.println("invalid");
        }
        if(detailDTO.getLocation()!=null && detailDTO.getLocation().length()>=3 && detailDTO.getLocation().length()<=100)
        {
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }
        if(this.orderDetailDAO!=null)
        {
            System.out.println("order detail in not null...");
            System.out.println("save the details....");
            this.orderDetailDAO.save(detailDTO);
        }
        return false;
    }
}

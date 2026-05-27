package com.academy.order.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDTO {
    private String orderType;
    private String item;
    private Double price;
    private String location;
    private Integer orderNo;

}

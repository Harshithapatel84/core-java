package com.app.sale.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class SalesDetailDTO implements Serializable {
    private  String sallername;
    private String item;
    private Double price;
    private Integer quantity;
    private String itemName;
}

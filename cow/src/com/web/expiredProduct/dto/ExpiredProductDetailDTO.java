package com.web.expiredProduct.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ExpiredProductDetailDTO implements Serializable {
    private String ProductName;
    private String prMfgDate;
    private Integer productId;
    private Double cost;
    private String prExpDate;

}

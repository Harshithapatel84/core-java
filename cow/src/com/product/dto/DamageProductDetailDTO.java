package com.product.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DamageProductDetailDTO implements Serializable {
    private String prName;
    private String brand;
    private Double price;
    private String damageType;
    private Integer quantity;

}

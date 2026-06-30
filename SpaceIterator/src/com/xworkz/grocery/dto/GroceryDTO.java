package com.xworkz.grocery.dto;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class GroceryDTO implements Serializable {
    private Integer itemId;
    private  String itemName;
    private String brand;
    private Double price;
    private Integer quantity;
    private  Double weight;
    private String category;
    private Boolean inStock;
}

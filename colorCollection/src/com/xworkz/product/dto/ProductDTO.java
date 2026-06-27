package com.xworkz.product.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable {

    private String ProductId;
    private String productName;
    private String type;

    public ProductDTO(String productId, String productName, String type) {
        ProductId = productId;
        this.productName = productName;
        this.type = type;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

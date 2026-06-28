package com.xworkz.product.dto;

import java.io.Serializable;

public class InventortDTO implements Serializable {
    private String itemId;
    private  String productName;
    private String quality;
    private String location;
    private String supplier;

    public InventortDTO(String itemId, String productName, String quality, String location, String supplier) {
        this.itemId = itemId;
        this.productName = productName;
        this.quality = quality;
        this.location = location;
        this.supplier = supplier;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}

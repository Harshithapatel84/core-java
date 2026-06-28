package com.xworkz.product.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class DiscountDTO implements Serializable {
    private String discountId;
    private String code;
    private String desc;
    private Double percentage;
    private LocalDate expDate;

    public DiscountDTO(String discountId, String code, String desc, Double percentage, LocalDate expDate) {
        this.discountId = discountId;
        this.code = code;
        this.desc = desc;
        this.percentage = percentage;
        this.expDate = expDate;
    }

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}

package com.xworkz.product.dto;

import java.io.Serializable;

public class CategoryDTO implements Serializable {
    private String categoryId;
    private String name;
    private String desc;
    private String parentId;
    private String status;

    public CategoryDTO(String categoryId, String name, String desc, String parentId, String status) {
        this.categoryId = categoryId;
        this.name = name;
        this.desc = desc;
        this.parentId = parentId;
        this.status = status;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

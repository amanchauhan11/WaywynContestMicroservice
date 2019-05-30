package com.example.WaywynContestMicroservice.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CategoriesTable")
public class CategoriesTableEntity {
    Integer categoryId;
    String categoryName;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

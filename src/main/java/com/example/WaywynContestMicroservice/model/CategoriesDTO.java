//categoryId: unique id for each category
//        categoryName: name of category


package com.example.WaywynContestMicroservice.model;

import java.util.Objects;

public class CategoriesDTO {

    private Integer categoryId;

    private String categoryName;

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

    @Override
    public String toString() {
        return "CategoriesDTO{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}

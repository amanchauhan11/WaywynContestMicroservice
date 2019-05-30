//categoryId: unique id for each category
//        categoryName: name of category


package com.example.WaywynContestMicroservice.model;

import java.util.Objects;

public class CategoriesDTO {

    int categoryId;

    String categoryName;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriesDTO that = (CategoriesDTO) o;
        return Objects.equals(categoryId, that.categoryId) &&
                Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(categoryId, categoryName);
    }

    @Override
    public String toString() {
        return "CategoriesDTO{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}

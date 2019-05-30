//categoryId: unique id for each category
//        categoryName: name of category


package com.example.WaywynContestMicroservice.model;

import java.util.Objects;

public class CategoriesTable {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriesTable that = (CategoriesTable) o;
        return Objects.equals(categoryId, that.categoryId) &&
                Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(categoryId, categoryName);
    }

    @Override
    public String toString() {
        return "CategoriesTable{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}

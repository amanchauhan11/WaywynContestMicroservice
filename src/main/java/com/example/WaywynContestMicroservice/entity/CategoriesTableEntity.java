package com.example.WaywynContestMicroservice.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
public class CategoriesTableEntity {

    @Id
    @GeneratedValue
   private Integer categoryId;

   private String categoryName;

//    @OneToMany(mappedBy = "categoryId")
//    private ContestDefinitionEntity contestDefinitionEntity;

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

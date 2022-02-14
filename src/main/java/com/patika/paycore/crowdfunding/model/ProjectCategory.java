package com.patika.paycore.crowdfunding.model;


public class ProjectCategory {

    private String categoryName;
    private String categoryDescription;

    public ProjectCategory() {
    }

    public ProjectCategory(String categoryName, String categoryDescription) {

        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryName() {return categoryName;}

    public void setCategoryName(String categoryName) {this.categoryName = categoryName;}

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
}


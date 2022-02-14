package com.patika.paycore.crowdfunding.service;

import com.patika.paycore.crowdfunding.model.ProjectCategory;

import java.util.List;
import java.util.Set;

public interface ProjectCategoryService {

    boolean createCategory(ProjectCategory category);

    List<ProjectCategory> getAllCategories();

    ProjectCategory getCategory(Integer id);

    boolean deleteCategory(Integer id);

    ProjectCategory updateCategory(String categoryName, ProjectCategory updatedCategory);
}


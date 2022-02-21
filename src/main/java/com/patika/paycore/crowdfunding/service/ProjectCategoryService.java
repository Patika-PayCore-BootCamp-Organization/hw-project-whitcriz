package com.patika.paycore.crowdfunding.service;

import com.patika.paycore.crowdfunding.model.entity.ProjectCategory;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProjectCategoryService {

    void createCategory(@RequestBody ProjectCategory projectCategory);

    List<ProjectCategory> getAllCategories();

    ProjectCategory getCategory(Integer id);

    ProjectCategory updateCategory(@RequestBody ProjectCategory projectCategory);

    boolean deleteCategory(Integer id);

    List<ProjectCategory> getCategoriesNameStartsWith(String prefix);

    ProjectCategory getCategoryByProject(Integer projectId);

    ProjectCategory getCategory(String name);

}
package com.patika.paycore.crowdfunding.service.impl;

import com.patika.paycore.crowdfunding.model.ProjectCategory;
import com.patika.paycore.crowdfunding.service.ProjectCategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class ProjectCategoryServiceImpl implements ProjectCategoryService {

    private List<ProjectCategory> categories = new ArrayList<>();
    {
        categories.add(new ProjectCategory("ART", "Big things have small beginnings, discover the art projects and help with their small beginnings"));
        categories.add(new ProjectCategory("FILM","Big things have small beginnings, discover the film and video projects and help with their small beginnings"));
        categories.add(new ProjectCategory("GAMES","Big things have small beginnings, discover the game projects and help for their small beginnings"));
        categories.add(new ProjectCategory("PUBLISHING", "Big things have small beginnings, discover the book and magazines projects and help with their small beginnings"));
        categories.add(new ProjectCategory("ILLUSTRATION", "Big things have small beginnings, discover fascinating illustration projects and help with their small beginnings"));
        categories.add(new ProjectCategory("DESIGN & TECHNOLOGY", "While technology is evolving day by day, you can help the creators to build the future with you by discovering the design & tech projects"));
        categories.add(new ProjectCategory("CRAFT", "The world needs creativity to feel better, you can start to feel better by discovering the craft projects"));

    }

    @Override
    public boolean createCategory(ProjectCategory category) {
        return categories.add(category);
    }

    @Override
    public List<ProjectCategory> getAllCategories() {
        return categories;
    }

    @Override
    public ProjectCategory getCategory(Integer id) {
        return null;
    }

    @Override
    public boolean deleteCategory(Integer id) {
            return false;
    }

    @Override
    public ProjectCategory updateCategory(String categoryName, ProjectCategory category) {
        AtomicBoolean status = new AtomicBoolean(false);
        categories.forEach(categoryItem -> {
            if (categoryItem.getCategoryName().equals(categoryName)) {
                status.set(true);
                categoryItem.setCategoryName(category.getCategoryName());
            }
        });
        if(status.get())
            return category;
        return null;
    }
}

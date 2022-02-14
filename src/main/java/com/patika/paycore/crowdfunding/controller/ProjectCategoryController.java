package com.patika.paycore.crowdfunding.controller;

import com.patika.paycore.crowdfunding.model.ProjectCategory;
import com.patika.paycore.crowdfunding.service.ProjectCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/category")
public class ProjectCategoryController {

    @Autowired
    private ProjectCategoryService projectCategoryService;

    @GetMapping(value = "/all")
    public List<ProjectCategory> getAllCategories() {
        return projectCategoryService.getAllCategories();
    }

    @PostMapping(value="/create")
    public boolean addCategory(@RequestBody ProjectCategory category){
        return projectCategoryService.createCategory(category);
    }
}

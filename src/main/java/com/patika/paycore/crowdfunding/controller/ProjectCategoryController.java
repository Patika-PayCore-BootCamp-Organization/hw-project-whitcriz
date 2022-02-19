package com.patika.paycore.crowdfunding.controller;

import com.patika.paycore.crowdfunding.exception.InvalidRequestException;
import com.patika.paycore.crowdfunding.model.entity.ProjectCategory;
import com.patika.paycore.crowdfunding.model.ProjectCategoryDTO;
import com.patika.paycore.crowdfunding.model.mapper.ProjectCategoryMapper;
import com.patika.paycore.crowdfunding.service.ProjectCategoryService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.*;
import java.util.stream.Collectors;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class ProjectCategoryController {


    private final ProjectCategoryService projectCategoryService;
    private static final ProjectCategoryMapper PROJECT_CATEGORY_MAPPER = Mappers.getMapper(ProjectCategoryMapper.class);

    @GetMapping(value = "/all")
    public List<ProjectCategoryDTO> getAllCategories() {
        List<ProjectCategory> allCategories = projectCategoryService.getAllCategories();
        return allCategories.stream().map(PROJECT_CATEGORY_MAPPER::toDto).collect(Collectors.toList());
    }

    @GetMapping(value = "/{id}")
    public ProjectCategoryDTO getCategory(@PathVariable @Min(1) Integer id) {
        return PROJECT_CATEGORY_MAPPER.toDto(projectCategoryService.getCategory(id));
    }

    @GetMapping(value = "/by-project/{projectId}")
    public ProjectCategory getCategoryByProject(@PathVariable @Min(1) Integer projectId) {
        return projectCategoryService.getCategoryByProject(projectId);
    }

    @GetMapping(value = "/{name}")
    public ProjectCategory getCategoryByName(@RequestBody String name) {
        return projectCategoryService.getCategory(name);
    }

    @PostMapping(value = "/create")
    public void addCategory(@Valid @RequestBody ProjectCategoryDTO projectCategory) {
        projectCategoryService.addCategory(PROJECT_CATEGORY_MAPPER.toEntity(projectCategory));
    }

   @PutMapping(value = "/update")
    public ProjectCategoryDTO updateCategory(@Valid @RequestBody ProjectCategory projectCategory) {
        if(projectCategory.getId() == null) {
            throw new InvalidRequestException("Project Category can not be null for update!");
        }
        return PROJECT_CATEGORY_MAPPER.toDto(projectCategoryService.updateCategory(projectCategory));
    }

    @DeleteMapping(value = "/delete")
    public boolean deleteCategory(@RequestParam @Min(1) Integer id) {
        return projectCategoryService.deleteCategory(id);
    }
}



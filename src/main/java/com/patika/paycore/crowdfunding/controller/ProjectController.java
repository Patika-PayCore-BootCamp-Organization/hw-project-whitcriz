package com.patika.paycore.crowdfunding.controller;

import com.patika.paycore.crowdfunding.model.entity.Project;
import com.patika.paycore.crowdfunding.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping(value = "/all")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping(value = "/all-by-category")
    public List<Project> getAllProjectsByCategory(Integer projectCategoryId) {
        return projectService.getAllProjectsByCategory(projectCategoryId);
    }

    @GetMapping(value = "/{id}")
    public Project getProject(@PathVariable @Min(1) Integer id) {
        return projectService.getProject(id);
    }

    @GetMapping(value = "/by-fundraiser/{fundraiserId}")
    public Project getProjectByFundraiser(@PathVariable @Min(1) Integer fundraiserId) {
        return projectService.getProjectByFundraiser(fundraiserId);
    }

    @GetMapping(value = "/{name}")
    public Project getProjectByName(@RequestBody String name) {
        return projectService.getProject(name);
    }

    @PutMapping(value = "/update")
    public Project updateProject(@Valid @RequestBody Project project) {
        return projectService.updateProject(project);
    }

}


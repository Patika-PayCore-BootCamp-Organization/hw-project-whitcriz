package com.patika.paycore.crowdfunding.service.impl;

import com.patika.paycore.crowdfunding.exception.NotFoundException;
import com.patika.paycore.crowdfunding.model.entity.Project;
import com.patika.paycore.crowdfunding.model.entity.ProjectCategory;
import com.patika.paycore.crowdfunding.repository.ProjectCategoryRepository;
import com.patika.paycore.crowdfunding.service.ProjectCategoryService;
import com.patika.paycore.crowdfunding.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProjectCategoryServiceImpl implements ProjectCategoryService {

    private final ProjectCategoryRepository projectCategoryRepository;
    private final ProjectService projectService;

    @Override
    public void createCategory(ProjectCategory projectCategory) {
        projectCategoryRepository.save(projectCategory);
    }

    @Override
    public List<ProjectCategory> getAllCategories() {
        return projectCategoryRepository.findAll();
    }

    @Override
    public ProjectCategory getCategory(Integer id) {
        Optional<ProjectCategory> byId = projectCategoryRepository.findById(id);
        return byId.orElseThrow(() -> new NotFoundException("Project Category"));
    }

    @Override
    public boolean deleteCategory(Integer id) {
        projectCategoryRepository.delete(getCategory(id));
        return true;
    }

    @Override
    public List<ProjectCategory> getCategoriesNameStartsWith(String prefix) {
        List<ProjectCategory> allCategories = getAllCategories();
        return allCategories.stream()
                .filter(p -> p.getName().startsWith(prefix))
                .collect(Collectors.toList());
    }

    @Override
    public ProjectCategory getCategoryByProject(Integer projectId) {
        Project project = projectService.getProject(projectId);
        return project.getProjectCategory();
    }

    @Override
    public ProjectCategory getCategory(String name) {
        return projectCategoryRepository.getByName(name);
    }

    @Override
    public ProjectCategory updateCategory(ProjectCategory projectCategory) {
        return projectCategoryRepository.save(projectCategory);
    }


}

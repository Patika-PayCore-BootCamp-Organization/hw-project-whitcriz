package com.patika.paycore.crowdfunding.service.impl;

import com.patika.paycore.crowdfunding.exception.NotFoundException;
import com.patika.paycore.crowdfunding.model.entity.*;
import com.patika.paycore.crowdfunding.repository.ProjectRepository;
import com.patika.paycore.crowdfunding.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final FundraiserService fundraiserService;
    private final FundService fundService;
    private final RewardService rewardService;
    private final ProjectCategoryService projectCategoryService;


    public boolean createProject(Project project) {
        projectRepository.save(project);
        return true;
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProject(Integer id) {
        Optional<Project> byId = projectRepository.findById(id);
        return byId.orElseThrow(() -> new NotFoundException("Project"));
    }


    @Override
    public Project getProject(String name) {
        return projectRepository.getByName(name);
    }

    @Override
    public Project getProjectByFundraiser(Integer fundraiserId) {
        Fundraiser fundraiser = fundraiserService.getFundraiser(fundraiserId);
        return fundraiser.getProject();
    }

    @Override
    public List<Project> getAllProjectsByCategory(Integer projectCategoryId) {
        return null;
    }

    @Override
    public Project updateProject(Project project) {
        return null;
    }

    @Override
    public boolean deleteProject(Integer id) {
        return false;
    }

    @Override
    public List<Reward> getAllRewardsByProjectName(String name) {
        return null;
    }

    @Override
    public List<Funder> getAllFundersByProjectName(String name) {
        return null;
    }

    @Override
    public List<Project> getProjectsNameStartsWith(String prefix) {
        return null;
    }

}



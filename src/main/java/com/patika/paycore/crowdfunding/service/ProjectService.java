package com.patika.paycore.crowdfunding.service;

import com.patika.paycore.crowdfunding.model.entity.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProjectService {

    boolean createProject(Project project);

    List<Project> getAllProjects();

    Project getProject(Integer id);

    Project getProject(String name);

    Project getProjectByFundraiser(Integer fundraiserId);

    List<Project> getAllProjectsByCategory(Integer projectCategoryId);

    Project updateProject(@RequestBody Project project);

    boolean deleteProject(Integer id);

    List<Reward> getAllRewardsByProjectName(String name);

    List<Funder> getAllFundersByProjectName(String name);

    List<Project> getProjectsNameStartsWith(String prefix);

}

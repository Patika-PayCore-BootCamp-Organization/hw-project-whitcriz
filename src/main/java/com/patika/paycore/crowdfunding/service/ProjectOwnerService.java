package com.patika.paycore.crowdfunding.service;

import com.patika.paycore.crowdfunding.model.entity.ProjectCategory;
import com.patika.paycore.crowdfunding.model.entity.ProjectOwner;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public interface ProjectOwnerService {

    void saveProjectOwner(@Valid @RequestBody ProjectOwner projectOwner);

    List<ProjectOwner> getAllProjectOwners();

    ProjectOwner getProjectOwner(Integer id);

    ProjectOwner updateProjectOwner(@RequestBody ProjectOwner projectOwner);

    boolean deleteProjectOwner(Integer id);

    List<ProjectOwner> getProjectOwnersNameStartsWith(String prefix);

    ProjectOwner getOwnerByProject(Integer projectId);

    ProjectOwner getProjectOwner(String name);
}

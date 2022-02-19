package com.patika.paycore.crowdfunding.model.mapper;

import com.patika.paycore.crowdfunding.model.entity.ProjectCategory;
import com.patika.paycore.crowdfunding.model.ProjectCategoryDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ProjectCategoryMapper {
    ProjectCategoryDTO toDto(ProjectCategory entity);

    ProjectCategory toEntity(ProjectCategoryDTO dto);
}

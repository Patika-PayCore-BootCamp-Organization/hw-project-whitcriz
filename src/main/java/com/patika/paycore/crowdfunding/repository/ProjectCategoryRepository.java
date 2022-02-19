package com.patika.paycore.crowdfunding.repository;

import com.patika.paycore.crowdfunding.model.entity.ProjectCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectCategoryRepository extends JpaRepository<ProjectCategory,Integer> {
    ProjectCategory getByName(String name);
}

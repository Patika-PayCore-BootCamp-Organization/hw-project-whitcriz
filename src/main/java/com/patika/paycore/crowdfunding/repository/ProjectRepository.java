package com.patika.paycore.crowdfunding.repository;

import com.patika.paycore.crowdfunding.model.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository {
     Project getByName(String name);
}

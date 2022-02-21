package com.patika.paycore.crowdfunding.repository;

import com.patika.paycore.crowdfunding.model.entity.ProjectOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectOwnerRepository extends JpaRepository<ProjectOwner, Integer> {

}

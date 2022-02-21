package com.patika.paycore.crowdfunding.repository;

import com.patika.paycore.crowdfunding.model.entity.Funder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FunderRepository extends JpaRepository<Funder, Integer> {
}

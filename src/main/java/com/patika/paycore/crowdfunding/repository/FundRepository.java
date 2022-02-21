package com.patika.paycore.crowdfunding.repository;

import com.patika.paycore.crowdfunding.model.entity.Fund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundRepository extends JpaRepository<Fund,Integer> {
}

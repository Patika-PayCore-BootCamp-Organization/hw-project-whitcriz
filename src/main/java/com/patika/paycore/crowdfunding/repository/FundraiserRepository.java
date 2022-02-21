package com.patika.paycore.crowdfunding.repository;

import com.patika.paycore.crowdfunding.model.entity.Fundraiser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundraiserRepository extends JpaRepository<Fundraiser, Integer> {
}

package com.patika.paycore.crowdfunding.repository;

import com.patika.paycore.crowdfunding.model.entity.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Integer> {
}

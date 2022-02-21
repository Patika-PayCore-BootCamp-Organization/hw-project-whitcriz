package com.patika.paycore.crowdfunding.service;

import com.patika.paycore.crowdfunding.model.entity.Fund;
import com.patika.paycore.crowdfunding.model.entity.Funder;
import com.patika.paycore.crowdfunding.model.entity.Project;
import com.patika.paycore.crowdfunding.model.entity.Reward;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RewardService {

    void createReward(@RequestBody Reward reward);

    List<Reward> getAllRewards();

    Reward getReward(Integer id);

    Reward getRewardByName(String name);

    List<Reward> getAllRewardsByFundraiser(Integer fundraiserId);

    List<Reward> getAllRewardsByProject(Integer projectId);

    Reward updateReward(@RequestBody Reward reward);

    boolean deleteReward(Integer id);

    List<Fund> getAllFundsByReward(Integer id);

    List<Funder> getAllFundersByReward(Integer id);

    Long getSumOfFundsByReward(Integer id);
}

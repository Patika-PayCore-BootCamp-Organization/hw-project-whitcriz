package com.patika.paycore.crowdfunding.service.impl;

import com.patika.paycore.crowdfunding.model.entity.Fund;
import com.patika.paycore.crowdfunding.model.entity.Funder;
import com.patika.paycore.crowdfunding.model.entity.Project;
import com.patika.paycore.crowdfunding.model.entity.Reward;
import com.patika.paycore.crowdfunding.service.RewardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardServiceImpl implements RewardService {

    @Override
    public void createReward(Reward reward) {

    }

    @Override
    public List<Reward> getAllRewards() {
        return null;
    }

    @Override
    public Reward getReward(Integer id) {
        return null;
    }

    @Override
    public Reward getRewardByName(String name) {
        return null;
    }

    @Override
    public List<Reward> getAllRewardsByFundraiser(Integer fundraiserId) {
        return null;
    }

    @Override
    public List<Reward> getAllRewardsByProject(Integer projectId) {
        return null;
    }

    @Override
    public Reward updateReward(Reward reward) {
        return null;
    }

    @Override
    public boolean deleteReward(Integer id) {
        return false;
    }

    @Override
    public List<Fund> getAllFundsByReward(Integer id) {
        return null;
    }

    @Override
    public List<Funder> getAllFundersByReward(Integer id) {
        return null;
    }

    @Override
    public Long getSumOfFundsByReward(Integer id) {
        return null;
    }

}

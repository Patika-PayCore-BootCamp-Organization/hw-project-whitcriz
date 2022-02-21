package com.patika.paycore.crowdfunding.service.impl;

import com.patika.paycore.crowdfunding.model.entity.Fund;
import com.patika.paycore.crowdfunding.model.entity.Funder;
import com.patika.paycore.crowdfunding.model.entity.Project;
import com.patika.paycore.crowdfunding.model.entity.Reward;
import com.patika.paycore.crowdfunding.repository.FundRepository;
import com.patika.paycore.crowdfunding.service.FundService;
import com.patika.paycore.crowdfunding.service.FunderService;
import com.patika.paycore.crowdfunding.service.RewardService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.Min;
import java.util.List;

@RequiredArgsConstructor
@Service
public class FundServiceImpl implements FundService {

    private final FundRepository fundRepository;
    private final RewardService rewardService;
    private final FunderService funderService;

    @Override
    public void createFund(@RequestBody Fund fund, @Min(1) Integer rewardId) {
        Reward reward = rewardService.getReward(rewardId);
       // Funder funder = funderService.
        if(reward == null){
            fundRepository.save(fund);
        }

    }

    @Override
    public List<Fund> getAllFunds() {
        return null;
    }

    @Override
    public Fund getFund(Integer id) {
        return null;
    }

    @Override
    public List<Fund> getAllFundsByCategory(Integer projectCategoryId) {
        return null;
    }

    @Override
    public List<Funder> getAllFundsByFunder(Integer funderId) {
        return null;
    }

    @Override
    public List<Fund> getAllFundsAmountBetween(long minFund, long maxFund) {
        return null;
    }


    @Override
    public boolean transferAllFundsByFundraiserToProjectOwner(Integer fundraiserId, Integer projectOwnerId) {
        return false;
    }
}

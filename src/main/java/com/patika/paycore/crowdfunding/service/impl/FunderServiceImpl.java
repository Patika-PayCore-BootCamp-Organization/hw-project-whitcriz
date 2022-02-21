package com.patika.paycore.crowdfunding.service.impl;

import com.patika.paycore.crowdfunding.model.entity.Funder;
import com.patika.paycore.crowdfunding.repository.FunderRepository;
import com.patika.paycore.crowdfunding.service.FunderService;
import com.patika.paycore.crowdfunding.service.FundraiserService;
import com.patika.paycore.crowdfunding.service.ProjectCategoryService;
import com.patika.paycore.crowdfunding.service.RewardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FunderServiceImpl implements FunderService {

    private final FunderRepository funderRepository;
    private final FundraiserService fundraiserService;
    private final ProjectCategoryService projectCategoryService;
    private final RewardService rewardService;

    @Override
    public void saveFunder(Funder funder) {

    }

    @Override
    public List<Funder> getAllFunders() {
        return null;
    }

    @Override
    public Funder getFunder(Integer id) {
        return null;
    }

    @Override
    public List<Funder> getAllFundersByFundraiser(Integer fundraiserId) {
        return null;
    }

    @Override
    public List<Funder> getAllFundersByCategory(Integer projectCategoryId) {
        return null;
    }

    @Override
    public List<Funder> getAllFundersByReward(Integer rewardId) {
        return null;
    }

    @Override
    public List<Funder> getAllFundersAgeBetween(long minFund, long maxFund) {
        return null;
    }

    @Override
    public Long getCountOfFundersByFundraiser(Integer fundraiserId) {
        return null;
    }

    @Override
    public Funder updateFunder(Funder funder) {
        return null;
    }

    @Override
    public boolean deleteFunder(Integer id) {
        return false;
    }
}

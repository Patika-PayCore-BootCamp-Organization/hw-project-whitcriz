package com.patika.paycore.crowdfunding.service;

import com.patika.paycore.crowdfunding.model.entity.Fund;
import com.patika.paycore.crowdfunding.model.entity.Funder;
import com.patika.paycore.crowdfunding.model.entity.Project;
import com.patika.paycore.crowdfunding.model.entity.Reward;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface FundService {

    void createFund(@RequestBody Fund fund, Integer rewardId);

    List<Fund> getAllFunds();

    Fund getFund(Integer id);

    List<Fund> getAllFundsByCategory(Integer projectCategoryId);

    List<Funder> getAllFundsByFunder(Integer funderId);

    List<Fund> getAllFundsAmountBetween(long minFund, long maxFund);

    boolean transferAllFundsByFundraiserToProjectOwner(Integer fundraiserId, Integer projectOwnerId);
}

package com.patika.paycore.crowdfunding.service;

import com.patika.paycore.crowdfunding.model.entity.Funder;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface FunderService {

    void saveFunder(@RequestBody Funder funder);

    List<Funder> getAllFunders();

    Funder getFunder(Integer id);

    List<Funder> getAllFundersByFundraiser(Integer fundraiserId);

    List<Funder> getAllFundersByCategory(Integer projectCategoryId);

    List<Funder> getAllFundersByReward(Integer rewardId);

    List<Funder> getAllFundersAgeBetween(long minFund, long maxFund);

    Long getCountOfFundersByFundraiser(Integer fundraiserId);

    Funder updateFunder(@RequestBody Funder funder);

    boolean deleteFunder(Integer id);

}

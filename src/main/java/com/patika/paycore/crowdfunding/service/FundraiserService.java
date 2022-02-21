package com.patika.paycore.crowdfunding.service;

import com.fasterxml.jackson.databind.DatabindException;
import com.patika.paycore.crowdfunding.model.entity.Fund;
import com.patika.paycore.crowdfunding.model.entity.Fundraiser;
import com.patika.paycore.crowdfunding.model.entity.Project;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;

public interface FundraiserService {

    boolean createFundraiser(@RequestBody Fundraiser fundraiser, Project project);

    List<Fundraiser> getAllFundraisers();

    Fundraiser getFundraiser(Integer id);

    Fundraiser getFundraiserByProject(Integer projectId);

    Fundraiser getFundraiserByProjectName(String name);

    List<Fund> getAllFundsByFundraiser(Integer Id);

    Long getCountOfFundsByFundraiser(Integer fundraiserId);

    Long getSumOfAllFundsByFundraiser(Integer id);

    Fundraiser updateFundraiser(@RequestBody Fundraiser fundraiser);

    boolean closeFundraiserByEndDate(Integer id, LocalDate endDate, Integer projectId);

}

package com.patika.paycore.crowdfunding.service.impl;

import com.patika.paycore.crowdfunding.exception.NotFoundException;
import com.patika.paycore.crowdfunding.model.entity.Fund;
import com.patika.paycore.crowdfunding.model.entity.Fundraiser;
import com.patika.paycore.crowdfunding.model.entity.Project;
import com.patika.paycore.crowdfunding.repository.FundraiserRepository;
import com.patika.paycore.crowdfunding.service.FundraiserService;
import com.patika.paycore.crowdfunding.service.ProjectOwnerService;
import com.patika.paycore.crowdfunding.service.ProjectService;
import com.patika.paycore.crowdfunding.service.RewardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FundraiserServiceImpl implements FundraiserService {

    private final FundraiserRepository fundraiserRepository;
    private final ProjectService projectService;
    private final RewardService rewardService;
    private final ProjectOwnerService projectOwnerService;

    @Override
    public boolean createFundraiser(Fundraiser fundraiser, Project project) {
        if(projectService.createProject(project)) {
            project.setFundraiser(fundraiser);
            fundraiser.setProject(project);
            fundraiserRepository.save(fundraiser);
            return true;
        }
        return false;
    }

    @Override
    public List<Fundraiser> getAllFundraisers() {
        return fundraiserRepository.findAll();
    }

    @Override
    public Fundraiser getFundraiser(Integer id) {
        Optional<Fundraiser> byId = fundraiserRepository.findById(id);
        return byId.orElseThrow(() -> new NotFoundException("Fundraiser"));
    }

    @Override
    public Fundraiser getFundraiserByProject(Integer projectId) {
        Project project = projectService.getProject(projectId);
        return project.getFundraiser();
    }

    @Override
    public Fundraiser getFundraiserByProjectName(String name) {
        Project project = projectService.getProjectByName(name);
        return getFundraiserByProject(project.getId());
    }

    @Override
    public List<Fund> getAllFundsByFundraiser(Integer id) {
        Optional<Fundraiser> fundraiser = fundraiserRepository.findById(id);
        return fundraiser.orElseThrow(() -> new NotFoundException("Fundraiser")).getFunds();
    }

    @Override
    public Long getCountOfFundsByFundraiser(Integer fundraiserId) {
        return null;
    }

    @Override
    public Fundraiser updateFundraiser(Fundraiser fundraiser) {
        return fundraiserRepository.save(fundraiser);
    }

    @Override
    public boolean closeFundraiserByEndDate(Integer id, LocalDate endDate,Integer projectId) {

        return true;
    }

    @Override
    public Long getSumOfAllFundsByFundraiser(Integer id) {
        List<Fund> allFunds = getAllFundsByFundraiser(id);
        // return (Long) allFunds.stream()
          //      .filter(fund -> fund.getFundAmount())
            //    .sum();
        return null;
    }

}

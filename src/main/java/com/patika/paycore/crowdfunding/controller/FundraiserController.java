package com.patika.paycore.crowdfunding.controller;

import com.patika.paycore.crowdfunding.exception.InvalidRequestException;
import com.patika.paycore.crowdfunding.model.FundraiserDTO;
import com.patika.paycore.crowdfunding.model.entity.Fundraiser;
import com.patika.paycore.crowdfunding.model.entity.Project;
import com.patika.paycore.crowdfunding.model.entity.ProjectCategory;
import com.patika.paycore.crowdfunding.model.mapper.FundraiserMapper;
import com.patika.paycore.crowdfunding.model.mapper.ProjectCategoryMapper;
import com.patika.paycore.crowdfunding.service.FundraiserService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Validated
@RestController
@RequestMapping("fundraiser")
public class FundraiserController {

    @Autowired
    private FundraiserService fundraiserService;
    private static final FundraiserMapper FUNDRAISER_MAPPER = Mappers.getMapper(FundraiserMapper.class);

    @GetMapping("/all")
    public List<FundraiserDTO> getAllFundraisers() {
        List<Fundraiser> allFundraisers = fundraiserService.getAllFundraisers();
        return allFundraisers.stream().map(FUNDRAISER_MAPPER::toDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public FundraiserDTO getFundraiser(Integer id) {
        return FUNDRAISER_MAPPER.toDto(fundraiserService.getFundraiser(id));
    }

    @GetMapping(value = "/by-project/{projectId}")
    public FundraiserDTO getFundraiserByProject(@PathVariable @Min(1) Integer projectId) {
        return FUNDRAISER_MAPPER.toDto(fundraiserService.getFundraiserByProject(projectId));
    }

    @PostMapping("/start")
    public boolean startFundraiser(@Valid @RequestBody Fundraiser fundraiser, Project project) {
        return fundraiserService.createFundraiser(fundraiser, project);
    }

    @PutMapping(value = "/update")
    public FundraiserDTO updateFundraiser(@Valid @RequestBody Fundraiser fundraiser) {
        if(fundraiser.getId() == null) {
            throw new InvalidRequestException("Fundraiser can not be null for update!");
        }
        return FUNDRAISER_MAPPER.toDto(fundraiserService.updateFundraiser(fundraiser));
    }

    @DeleteMapping(value = "/delete")
    public boolean closeFundraiserByEndDate(@RequestParam @Min(1) Integer id, LocalDate endDate, Integer projectId) {
        if(endDate.equals(LocalDate.now())) {
            return fundraiserService.closeFundraiserByEndDate(id,endDate,projectId);
        }
        System.out.println("Fundraiser can not be closed before end date!");
        return false;
    }
}

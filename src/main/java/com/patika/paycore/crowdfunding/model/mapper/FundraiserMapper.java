package com.patika.paycore.crowdfunding.model.mapper;

import com.patika.paycore.crowdfunding.model.FundraiserDTO;
import com.patika.paycore.crowdfunding.model.entity.Fundraiser;
import org.mapstruct.Mapper;

@Mapper
public interface FundraiserMapper {
    FundraiserDTO toDto(Fundraiser entity);

    Fundraiser toEntity(FundraiserDTO dto);
}

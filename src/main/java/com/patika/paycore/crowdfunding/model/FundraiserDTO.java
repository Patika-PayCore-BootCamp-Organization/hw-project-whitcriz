package com.patika.paycore.crowdfunding.model;

import lombok.Data;

import java.util.Date;

@Data
public class FundraiserDTO {
    private Date startDate;
    private Date endDate;
    private long goalAmount;
}

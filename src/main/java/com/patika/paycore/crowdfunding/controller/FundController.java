package com.patika.paycore.crowdfunding.controller;

import com.patika.paycore.crowdfunding.service.FundService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/fund")
public class FundController {

    @Autowired
    private final FundService fundService;


    // @NotNull(message = "fund amount can not be null")


}

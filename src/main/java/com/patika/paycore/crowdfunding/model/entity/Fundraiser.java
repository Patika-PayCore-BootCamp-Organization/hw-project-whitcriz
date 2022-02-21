package com.patika.paycore.crowdfunding.model.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "fundraiser")
public class Fundraiser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @NotNull(message = "start date can not be null")
    @JsonFormat(pattern = "dd MMMM yyyy")
    private LocalDate startDate;

    @NotNull(message = "end date can not be null")
    @JsonFormat(pattern = "dd MMMM yyyy")
    private LocalDate endDate;

    @NotNull(message = "goal amount can not be null")
    private Double goalAmount;

    @OneToMany(fetch = LAZY)
    private List<Fund> funds;

    @OneToMany(fetch = LAZY, mappedBy = "fundraiser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reward> rewards;

    @ManyToMany(fetch = LAZY)
    private List<Funder> funders;

    @ManyToOne(fetch = LAZY)
    private ProjectOwner projectOwner;

    @NotNull(message = "project can not be null")
    @OneToOne(fetch = LAZY, mappedBy = "fundraiser", cascade = CascadeType.ALL, orphanRemoval = true)
    private Project project;

}
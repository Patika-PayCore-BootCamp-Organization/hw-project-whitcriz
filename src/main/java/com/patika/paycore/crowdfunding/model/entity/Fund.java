package com.patika.paycore.crowdfunding.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static javax.persistence.FetchType.LAZY;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "fund")
public class Fund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "fund_amount")
    private Long fundAmount;

    @NotNull(message = "funder can not be null")
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "funder_id", referencedColumnName = "id")
    private Funder funder;

    @NotNull(message = "reward can not be null")
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "reward_id", referencedColumnName = "id")
    private Reward reward;

    @NotNull(message = "fundraiser can not be null")
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "fundraiser_id", referencedColumnName = "id")
    private Fundraiser fundraiser;

}

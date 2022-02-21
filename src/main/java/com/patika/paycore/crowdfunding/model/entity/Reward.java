package com.patika.paycore.crowdfunding.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Reward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    private String name;
    private String description;
    private Integer quota;
    private Double minimumFundAmount;

    @JsonFormat(pattern = "MMMM yyyy")
    private String estimatedDeliveryDate;

    @OneToMany(mappedBy = "reward",cascade = CascadeType.ALL, fetch = LAZY)
    private List<Fund> funds;

    @ManyToMany (fetch = LAZY)
    private List<Funder> funders;

    @ManyToOne(fetch = LAZY)
    private Fundraiser fundraiser;

    @ManyToOne(fetch = LAZY)
    private ProjectOwner projectOwner;
}

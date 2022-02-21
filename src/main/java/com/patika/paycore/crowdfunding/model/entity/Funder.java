package com.patika.paycore.crowdfunding.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "funder")
public class Funder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @NotNull(message = "fullname can not be null")
    private String fullname;

    private String gender;
    private  Integer age;

    @NotNull(message = "phone can not be null")
    private String phone;

    @Email
    private String email;

    @ManyToMany (fetch = LAZY)
    private List<Reward> rewards;

    @NotNull(message = "fundraiser can not be null")
    @ManyToMany(fetch = LAZY)
    private List<Fundraiser> fundraisers;

    @OneToMany(fetch = LAZY)
    private List<Fund> funds;
}

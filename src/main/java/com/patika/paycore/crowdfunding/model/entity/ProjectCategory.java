package com.patika.paycore.crowdfunding.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="project_category")
public class ProjectCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @NotNull(message = "name can not be null")
    private String name;

    @NotNull(message = "description can not be null")
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "project_category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Project> projects;

}


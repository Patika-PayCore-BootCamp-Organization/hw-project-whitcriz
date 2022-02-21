package com.patika.paycore.crowdfunding.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    @NotNull(message = "name can not be null")
    private String name;

    @NotNull(message = "description can not be null")
    private String description;

    @Column(name = "image_link")
    private String imageLink;

    @Column(name = "video_link")
    private String videoLink;

    @NotNull(message = "fundraiser can not be null")
    @OneToOne(fetch = LAZY, mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private Fundraiser fundraiser;

    @NotNull(message = "project category can not be null")
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "project_category_id", referencedColumnName = "id")
    private ProjectCategory projectCategory;

    @NotNull(message = "project owner can not be null")
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "project_owner_id", referencedColumnName = "id")
    private ProjectOwner projectOwner;

}

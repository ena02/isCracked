package com.ena.iscracked.model;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private String description;

    @Column
    private String trailer;

    @Column(nullable = false)
    @OneToMany(targetEntity = Status.class)
    private List<Long> statusId;

    @Column(columnDefinition = "boolean default true")
    private Boolean isAaa;

    @Column
    @Min(0)
    @Max(100)
    @NotBlank(message = "The minimum value is 0, and the maximum value is 100")
    private Integer metaScore;

    @Column
    @Min(0)
    @Max(10)
    @NotBlank(message = "The minimum value is 0, and the maximum value is 10")
    private Float userScore;

    @Column(nullable = false)
    private Date realiseDate;

    @Column
    private Date crackDate;

    @Column(nullable = false)
    private String protect;

    @Column(nullable = false)
    private String groups;
}

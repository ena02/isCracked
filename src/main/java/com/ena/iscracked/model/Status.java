package com.ena.iscracked.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "status")
@Data
public class Status {

    @Id
    private Long id;

    @Column(unique = true, nullable = false)
    private String statusName;
}

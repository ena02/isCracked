package com.ena.iscracked.model;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "requirements")
@Data
public class Requirements implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(targetEntity = Game.class)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Long id;

    @Column
    private String cpu;

    @Column
    private String ram;

    @Column
    private String oc;

    @Column
    private String gpu;
}

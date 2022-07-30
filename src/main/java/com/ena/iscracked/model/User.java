package com.ena.iscracked.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Length(min = 3, max = 20)
    private String username;

    @Column
    private String email;

    @Column
    @Length(min = 8, max = 50)
    private String password;
}

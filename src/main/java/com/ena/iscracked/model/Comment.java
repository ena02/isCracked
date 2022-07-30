package com.ena.iscracked.model;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "comments")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Length(min = 2, max = 1000)
    @NotBlank(message = "The minimum value is 2, and the maximum value is 1000")
    private String text;

    @Column(nullable = false)
    @OneToMany(targetEntity = Game.class)
    @JoinColumn(name = "game_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Long> gameId;

    @Column
    @OneToMany(targetEntity = User.class)
    private List<Long> userId;
}

package com.algorithm.archive.problem.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Algorithm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AlgorithmType type;

    @ManyToOne
    @JoinColumn(name = "problem_id")
    private Problem problem;

}

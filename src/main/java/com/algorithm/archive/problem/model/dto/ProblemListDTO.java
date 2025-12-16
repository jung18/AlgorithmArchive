package com.algorithm.archive.problem.model.dto;

import com.algorithm.archive.enums.AlgorithmType;
import com.algorithm.archive.problem.model.entity.Problem;
import com.algorithm.archive.enums.ProblemLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class ProblemListDTO {

    private Long problemId;

    private long problemNumber;

    private String title;

    private ProblemLevel level;

    private Set<AlgorithmType> algorithms;

    public ProblemListDTO(Problem problem) {
        this.problemId = problem.getId();
        this.problemNumber = problem.getProblemNumber();
        this.title = problem.getTitle();
        this.level = problem.getLevel();
        this.algorithms = problem.getAlgorithms();
    }
}

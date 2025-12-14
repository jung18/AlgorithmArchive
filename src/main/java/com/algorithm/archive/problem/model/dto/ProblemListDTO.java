package com.algorithm.archive.problem.model.dto;

import com.algorithm.archive.problem.model.entity.Algorithm;
import com.algorithm.archive.problem.model.entity.Problem;
import com.algorithm.archive.problem.model.entity.ProblemLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProblemListDTO {

    private Long problemId;

    private long problemNumber;

    private String title;

    private ProblemLevel level;

    private List<Algorithm> algorithms;

    public ProblemListDTO(Problem problem) {
        this.problemId = problem.getId();
        this.problemNumber = problem.getProblemNumber();
        this.title = problem.getTitle();
        this.level = problem.getLevel();
        this.algorithms = new ArrayList<>(problem.getAlgorithms());
    }
}

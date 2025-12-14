package com.algorithm.archive.problem.model.dto;

import com.algorithm.archive.problem.model.entity.Algorithm;
import com.algorithm.archive.problem.model.entity.Problem;
import com.algorithm.archive.problem.model.entity.ProblemLevel;
import com.algorithm.archive.solution.model.dto.SolutionDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProblemDetailDTO {

    private Long problemId;

    private long problemNumber;

    private ProblemLevel level;

    private List<Algorithm> algorithms;

    private String title;

    private String content;

    private List<SolutionDTO> solutions;

    public ProblemDetailDTO(Problem problem) {
        this.problemId = problem.getId();
        this.problemNumber = problem.getProblemNumber();
        this.level = problem.getLevel();
        this.algorithms = new ArrayList<>(problem.getAlgorithms());
        this.title = problem.getTitle();
        this.content = problem.getContent();
        this.solutions = problem.getSolutions().stream()
                .map(solution -> new SolutionDTO(solution))
                .toList();
    }

}

package com.algorithm.archive.problem.model.dto;

import com.algorithm.archive.problem.model.entity.Algorithm;
import com.algorithm.archive.problem.model.entity.ProblemLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateProblemDTO {

    private long problemNumber;

    private ProblemLevel level;

    private List<Algorithm> algorithms;

    private String title;

    private String content;

}

package com.algorithm.archive.problem.model.dto;

import com.algorithm.archive.enums.AlgorithmType;
import com.algorithm.archive.enums.ProblemLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class CreateProblemDTO {

    private long problemNumber;

    private ProblemLevel level;

    private Set<AlgorithmType> algorithms;

    private String title;

    private String content;

}

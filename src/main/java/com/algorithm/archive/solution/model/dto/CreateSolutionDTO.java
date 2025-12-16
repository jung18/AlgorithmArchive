package com.algorithm.archive.solution.model.dto;

import com.algorithm.archive.solution.model.entity.Language;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateSolutionDTO {

    private Language language;

    private String code;

    private String memo;

    private float time;

    private long memory;

}

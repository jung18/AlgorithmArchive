package com.algorithm.archive.solution.model.dto;

import com.algorithm.archive.solution.model.entity.Language;
import com.algorithm.archive.solution.model.entity.Solution;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SolutionDTO {

    private Long solutionId;

    private Language language;

    private String code;

    private String memo;

    private float time;

    private long memory;

    private Date createdAt;

    private Date updatedAt;

    public SolutionDTO(Solution solution) {
        this.solutionId = solution.getId();
        this.language = solution.getLanguage();
        this.code = solution.getCode();
        this.memo = solution.getMemo();
        this.time = solution.getTime();
        this.memory = solution.getMemory();
        this.createdAt = solution.getCreatedAt();
        this.updatedAt = solution.getUpdatedAt();
    }

}

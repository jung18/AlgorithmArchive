package com.algorithm.archive.reference.model.dto;

import com.algorithm.archive.enums.AlgorithmType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlgorithmTypeDTO {

    private String code;

    private String displayName;

    public AlgorithmTypeDTO(AlgorithmType type) {
        this.code = type.getCode();
        this.displayName = type.getDisplayName();
    }

}

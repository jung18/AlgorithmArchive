package com.algorithm.archive.reference.model.dto;

import com.algorithm.archive.enums.AlgorithmType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnumDTO {

    private String code;

    private String displayName;

    public EnumDTO(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

}

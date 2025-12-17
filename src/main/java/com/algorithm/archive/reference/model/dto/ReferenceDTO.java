package com.algorithm.archive.reference.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ReferenceDTO {

    private List<EnumDTO> algorithms;

    private List<EnumDTO> languages;

    private List<EnumDTO> levels;

    public ReferenceDTO(List<EnumDTO> algorithms, List<EnumDTO> languages, List<EnumDTO> levels) {
        this.algorithms = algorithms;
        this.languages = languages;
        this.levels = levels;
    }

}

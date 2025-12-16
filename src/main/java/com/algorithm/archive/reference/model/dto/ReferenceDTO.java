package com.algorithm.archive.reference.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ReferenceDTO {

    private List<AlgorithmTypeDTO> algorithms;

    private List<String> languages;

    private List<String> levels;

    public ReferenceDTO(List<AlgorithmTypeDTO> algorithms, List<String> languages, List<String> levels) {
        this.algorithms = algorithms;
        this.languages = languages;
        this.levels = levels;
    }

}

package com.algorithm.archive.reference.model.service;

import com.algorithm.archive.enums.AlgorithmType;
import com.algorithm.archive.enums.Language;
import com.algorithm.archive.enums.ProblemLevel;
import com.algorithm.archive.reference.model.dto.AlgorithmTypeDTO;
import com.algorithm.archive.reference.model.dto.ReferenceDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ReferenceService {

    public ReferenceDTO findReferenceData() {
        List<AlgorithmTypeDTO> typeList = Arrays.stream(AlgorithmType.values())
                .map(type -> new AlgorithmTypeDTO(type))
                .toList();
        List<String> languageList = Arrays.stream(Language.values())
                .map(language -> language.name())
                .toList();
        List<String> levelList = Arrays.stream(ProblemLevel.values())
                .map(level -> level.name())
                .toList();

        return new ReferenceDTO(typeList, languageList, levelList);
    }

}

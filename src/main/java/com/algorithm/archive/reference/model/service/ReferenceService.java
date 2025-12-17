package com.algorithm.archive.reference.model.service;

import com.algorithm.archive.enums.AlgorithmType;
import com.algorithm.archive.enums.Language;
import com.algorithm.archive.enums.ProblemLevel;
import com.algorithm.archive.reference.model.dto.EnumDTO;
import com.algorithm.archive.reference.model.dto.ReferenceDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ReferenceService {

    public ReferenceDTO findReferenceData() {
        List<EnumDTO> typeList = Arrays.stream(AlgorithmType.values())
                .map(type -> new EnumDTO(type.getCode(), type.getDisplayName()))
                .toList();
        List<EnumDTO> languageList = Arrays.stream(Language.values())
                .map(language -> new EnumDTO(language.getCode(), language.getDisplayName()))
                .toList();
        List<EnumDTO> levelList = Arrays.stream(ProblemLevel.values())
                .map(level -> new EnumDTO(level.getCode(), level.getDisplayName()))
                .toList();

        return new ReferenceDTO(typeList, languageList, levelList);
    }

}

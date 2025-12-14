package com.algorithm.archive.solution.controller;

import com.algorithm.archive.solution.model.service.SolutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SolutionController {

    private final SolutionService solutionService;

}

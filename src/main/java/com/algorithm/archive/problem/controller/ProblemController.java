package com.algorithm.archive.problem.controller;

import com.algorithm.archive.problem.model.service.ProblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProblemController {

    private final ProblemService problemService;



}

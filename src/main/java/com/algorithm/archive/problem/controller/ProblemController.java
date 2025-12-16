package com.algorithm.archive.problem.controller;

import com.algorithm.archive.problem.model.dto.CreateProblemDTO;
import com.algorithm.archive.problem.model.dto.ProblemDetailDTO;
import com.algorithm.archive.problem.model.dto.ProblemListDTO;
import com.algorithm.archive.problem.model.entity.AlgorithmType;
import com.algorithm.archive.problem.model.service.ProblemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProblemController {

    private final ProblemService problemService;

    @GetMapping("/problem")
    public ResponseEntity<?> findAllProblems() {
        List<ProblemListDTO> result = problemService.findAllProblems();
        return ResponseEntity.ok(Map.of("data", result));
    }

    @GetMapping("/problem/{problemId}")
    public ResponseEntity<?> findProblemById(@PathVariable Long problemId) {
        ProblemDetailDTO result = problemService.findProblemById(problemId);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/problem")
    public ResponseEntity<?> createProblem(@RequestBody CreateProblemDTO dto) {
        Long createdId = problemService.createProblem(dto);
        return ResponseEntity.ok(Map.of("problemId", createdId));
    }

    @PutMapping("/problem/{problemId}")
    public ResponseEntity<?> updateProblem(@PathVariable Long problemId, @RequestBody CreateProblemDTO dto) {
        problemService.updateProblem(problemId, dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/problem/{problemId}")
    public ResponseEntity<?> deleteProblem(@PathVariable Long problemId) {
        problemService.deleteProblem(problemId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/algorithm")
    public ResponseEntity<?> findAllAlgorithms() {
        Map<String, String> result = problemService.findAllAlgorithms();
        return ResponseEntity.ok(result);
    }

}

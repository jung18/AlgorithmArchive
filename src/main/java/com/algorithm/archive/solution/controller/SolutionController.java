package com.algorithm.archive.solution.controller;

import com.algorithm.archive.solution.model.dto.CreateSolutionDTO;
import com.algorithm.archive.solution.model.service.SolutionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/problem/{problemId}")
@RequiredArgsConstructor
public class SolutionController {

    private final SolutionService solutionService;

    @PostMapping("/solution")
    public ResponseEntity<?> createSolution(@PathVariable Long problemId, @RequestBody CreateSolutionDTO dto) {
        Long createdId = solutionService.createSolution(problemId, dto);
        return ResponseEntity.ok(Map.of("solutionId", createdId));
    }

    @PutMapping("/solution/{solutionId}")
    public ResponseEntity<?> updateSolution(@PathVariable Long problemId, @PathVariable Long solutionId, @RequestBody CreateSolutionDTO dto) {
        solutionService.updateSolution(problemId, solutionId, dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/solution/{solutionId}")
    public ResponseEntity<?> deleteSolution(@PathVariable Long problemId, @PathVariable Long solutionId) {
        solutionService.deleteSolution(problemId, solutionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

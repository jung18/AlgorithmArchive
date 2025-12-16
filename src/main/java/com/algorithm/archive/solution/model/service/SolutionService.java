package com.algorithm.archive.solution.model.service;

import com.algorithm.archive.problem.model.entity.Problem;
import com.algorithm.archive.problem.model.repository.ProblemRepository;
import com.algorithm.archive.solution.model.dto.CreateSolutionDTO;
import com.algorithm.archive.solution.model.entity.Solution;
import com.algorithm.archive.solution.model.repository.SolutionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SolutionService {

    private final ProblemRepository problemRepository;
    private final SolutionRepository solutionRepository;

    public Long createSolution(Long problemId, CreateSolutionDTO dto) {
        Problem problem = problemRepository.findById(problemId).orElseThrow(() -> new RuntimeException("problem not found"));
        Solution newSolution = new Solution(dto.getLanguage(), dto.getCode(), dto.getMemo(), dto.getTime(), dto.getMemory());
        problem.addSolution(newSolution);
        Solution saved = solutionRepository.save(newSolution);
        return saved.getId();
    }

    public void updateSolution(Long problemId, Long solutionId, CreateSolutionDTO dto) {
        Solution solution = solutionRepository.findById(solutionId).orElseThrow(() -> new RuntimeException("solution not found"));
        solution.setLanguage(dto.getLanguage());
        solution.setCode(dto.getCode());
        solution.setMemo(dto.getMemo());
        solution.setTime(dto.getTime());
        solution.setMemory(dto.getMemory());
    }

    public void deleteSolution(Long problemId, Long solutionId) {
        solutionRepository.deleteById(solutionId);
    }

}

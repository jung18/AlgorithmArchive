package com.algorithm.archive.problem.model.service;

import com.algorithm.archive.problem.model.dto.CreateProblemDTO;
import com.algorithm.archive.problem.model.dto.ProblemDetailDTO;
import com.algorithm.archive.problem.model.dto.ProblemListDTO;
import com.algorithm.archive.problem.model.entity.AlgorithmType;
import com.algorithm.archive.problem.model.entity.Problem;
import com.algorithm.archive.problem.model.repository.ProblemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ProblemService {

    private final ProblemRepository problemRepository;

    public List<ProblemListDTO> findAllProblems() {
        return problemRepository.findAll().stream()
                .map(problem -> new ProblemListDTO(problem))
                .toList();
    }

    public ProblemDetailDTO findProblemById(Long problemId) {
        Problem problem = problemRepository.findProblemById(problemId);
        return new ProblemDetailDTO(problem);
    }

    public Long createProblem(CreateProblemDTO dto) {
        Problem newProblem = new Problem(dto.getProblemNumber(), dto.getLevel(), dto.getAlgorithms(), dto.getTitle(), dto.getContent());
        Problem saved = problemRepository.save(newProblem);
        return saved.getId();
    }

    public void updateProblem(Long problemId, CreateProblemDTO dto) {
        Problem problem = problemRepository.findById(problemId).orElseThrow(() -> new RuntimeException("problem not found"));
        problem.setProblemNumber(dto.getProblemNumber());
        problem.setLevel(dto.getLevel());
        problem.setAlgorithms(dto.getAlgorithms());
        problem.setTitle(dto.getTitle());
        problem.setContent(dto.getContent());
    }

    public void deleteProblem(Long problemId) {
        problemRepository.deleteById(problemId);
    }

    public Map<String, String> findAllAlgorithms() {
        Map<String, String> response = new HashMap<>();
        Arrays.stream(AlgorithmType.values())
                .forEach(type -> response.put(type.getCode(), type.getDisplayName()));
        return response;
    }

}

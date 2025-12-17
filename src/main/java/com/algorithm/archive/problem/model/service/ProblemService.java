package com.algorithm.archive.problem.model.service;

import com.algorithm.archive.problem.model.dto.CreateProblemDTO;
import com.algorithm.archive.problem.model.dto.ProblemDetailDTO;
import com.algorithm.archive.problem.model.dto.ProblemListDTO;
import com.algorithm.archive.enums.AlgorithmType;
import com.algorithm.archive.problem.model.entity.Problem;
import com.algorithm.archive.enums.ProblemLevel;
import com.algorithm.archive.problem.model.repository.ProblemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
@RequiredArgsConstructor
public class ProblemService {

    private final ProblemRepository problemRepository;

    public Page<ProblemListDTO> findAllProblems(int page, int size, String sort) {
        Sort.Direction sortBy = "asc".equalsIgnoreCase(sort) ? Sort.Direction.ASC : Sort.Direction.DESC;
        Sort sortObj = Sort.by(sortBy, "updatedAt").and(Sort.by(sortBy, "id"));
        PageRequest pageRequest = PageRequest.of(page, size, sortObj);

        return problemRepository.findAll(pageRequest)
                .map(problem -> new ProblemListDTO(problem));
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
        problem.setTitle(dto.getTitle());
        problem.setContent(dto.getContent());
        problem.replaceAlgorithms(dto.getAlgorithms());
    }

    public void deleteProblem(Long problemId) {
        problemRepository.deleteById(problemId);
    }

}

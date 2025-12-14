package com.algorithm.archive.solution.model.repository;

import com.algorithm.archive.solution.model.entity.Solution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolutionRepository extends JpaRepository<Solution, Long> {
}

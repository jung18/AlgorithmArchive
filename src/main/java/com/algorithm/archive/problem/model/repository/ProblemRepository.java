package com.algorithm.archive.problem.model.repository;

import com.algorithm.archive.problem.model.entity.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
}

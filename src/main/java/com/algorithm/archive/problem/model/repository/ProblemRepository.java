package com.algorithm.archive.problem.model.repository;

import com.algorithm.archive.problem.model.entity.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProblemRepository extends JpaRepository<Problem, Long> {

    @Query("select p from Problem p" +
            "join fetch p.solutions" +
            "where p.id = :problemId")
    Problem findProblemById(Long problemId);

}

package com.algorithm.archive.problem.model.entity;

import com.algorithm.archive.solution.model.entity.Solution;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.*;

@Entity
@Getter
@Setter
public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long problemNumber;

    @Enumerated(EnumType.STRING)
    private ProblemLevel level;

    @OneToMany(mappedBy = "problem")
    private Set<Algorithm> algorithms = new HashSet<>();

    private String title;

    @Column(columnDefinition = "longtext")
    private String content;

    @OneToMany(mappedBy = "problem", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Solution> solutions = new ArrayList<>();

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

}

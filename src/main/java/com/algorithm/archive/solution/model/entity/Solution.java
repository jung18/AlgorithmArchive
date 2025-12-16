package com.algorithm.archive.solution.model.entity;

import com.algorithm.archive.enums.Language;
import com.algorithm.archive.problem.model.entity.Problem;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Solution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Language language;

    private String code;

    private String memo;

    private float time;

    private long memory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "problem_id")
    private Problem problem;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

    public Solution(Language language, String code, String memo, float time, long memory) {
        this.language = language;
        this.code = code;
        this.memo = memo;
        this.time = time;
        this.memory = memory;
    }

}

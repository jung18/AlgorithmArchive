package com.algorithm.archive.reference.controller;

import com.algorithm.archive.reference.model.dto.ReferenceDTO;
import com.algorithm.archive.reference.model.service.ReferenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reference")
@RequiredArgsConstructor
public class ReferenceController {

    private final ReferenceService referenceService;

    @GetMapping
    public ResponseEntity<?> findReferenceData() {
        ReferenceDTO result = referenceService.findReferenceData();
        return ResponseEntity.ok(result);
    }

}

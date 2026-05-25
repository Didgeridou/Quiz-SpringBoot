package com.quiz.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.api.dto.PartieRequest;
import com.quiz.api.entity.Partie;
import com.quiz.api.service.PartieService;

@RestController
@RequestMapping("/api/parties")
public class PartieController {

    private final PartieService service;

    public PartieController(PartieService service) {
        this.service = service;
    }

    @GetMapping
    public List<Partie> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ResponseEntity<Partie> create(@RequestBody PartieRequest request) {
        Partie newPartie = service.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(newPartie);
    }

    
}

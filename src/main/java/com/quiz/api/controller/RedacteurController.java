package com.quiz.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.api.entity.Redacteur;
import com.quiz.api.service.RedacteurService;

@RestController
@RequestMapping("/api/redacteurs")
public class RedacteurController {

    private final RedacteurService service;

    public RedacteurController(RedacteurService service) {
        this.service = service;
    }

    @GetMapping
    public List<Redacteur> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ResponseEntity<Redacteur> create(@RequestBody Redacteur redacteur) {
        Redacteur newRedacteur = service.create(redacteur);
        return ResponseEntity.status(HttpStatus.CREATED).body(newRedacteur);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

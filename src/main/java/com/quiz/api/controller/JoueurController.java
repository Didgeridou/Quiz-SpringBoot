package com.quiz.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.api.entity.Joueur;
import com.quiz.api.service.JoueurService;

@RestController
@RequestMapping("/api/joueurs")
public class JoueurController {

    private final JoueurService service;

    public JoueurController(JoueurService service) {
        this.service = service;
    }

    @GetMapping
    public List<Joueur> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ResponseEntity<Joueur> create(@RequestBody Joueur joueur) {
        Joueur newJoueur = service.create(joueur);
        return ResponseEntity.status(HttpStatus.CREATED).body(newJoueur);
    }
}

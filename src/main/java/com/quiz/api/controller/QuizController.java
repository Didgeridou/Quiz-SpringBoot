package com.quiz.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.api.dto.QuizRequest;
import com.quiz.api.entity.Quiz;
import com.quiz.api.service.QuizService;

@RestController
@RequestMapping("/api/quizz")
public class QuizController {

    private final QuizService service;

    public QuizController(QuizService service) {
        this.service = service;
    }

    @GetMapping
    public List<Quiz> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Quiz> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public ResponseEntity<Quiz> create(@RequestBody QuizRequest request) {
        Quiz quiz = service.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(quiz);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

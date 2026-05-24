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

import com.quiz.api.entity.Question;
import com.quiz.api.service.QuestionService;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService service) {
        this.questionService = service;
    }

    @GetMapping
    public List<Question> getAll() {
        return questionService.getAll();
    }

    @PostMapping
    public ResponseEntity<Question> create(@RequestBody Question question) {
        Question newQuestion = questionService.create(question);
        return ResponseEntity.status(HttpStatus.CREATED).body(newQuestion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        questionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

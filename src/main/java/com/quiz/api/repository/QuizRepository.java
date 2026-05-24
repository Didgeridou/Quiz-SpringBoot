package com.quiz.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.api.dto.QuizRequest;
import com.quiz.api.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> { 

    
}

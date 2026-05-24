package com.quiz.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.api.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> { 

    
}

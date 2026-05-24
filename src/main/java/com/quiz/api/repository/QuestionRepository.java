package com.quiz.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.api.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{
    
}

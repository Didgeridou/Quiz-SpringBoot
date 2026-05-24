package com.quiz.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.api.entity.Redacteur;

public interface RedacteurRepository extends JpaRepository<Redacteur, Long>{
    
}

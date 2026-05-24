package com.quiz.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.api.entity.Partie;

public interface PartieRepository extends JpaRepository<Partie, Integer>{
    
}

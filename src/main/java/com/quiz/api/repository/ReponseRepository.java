package com.quiz.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.api.entity.Reponse;

public interface ReponseRepository extends JpaRepository<Reponse, Long>{
    
}

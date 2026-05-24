package com.quiz.api.dto;

import com.quiz.api.entity.Quiz;

import jakarta.validation.constraints.NotBlank;

public class QuizRequest {
    @NotBlank
    private String nom;
    private Quiz.Categorie categorie;
    private Long redacteurId;

    public String getNom(){
        return nom;
    }

    public Long getRedacteurId(){
        return redacteurId;
    }

    public Quiz.Categorie getCategorie(){
        return categorie;
    }



}


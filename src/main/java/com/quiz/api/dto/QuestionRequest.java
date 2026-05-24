package com.quiz.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class QuestionRequest {

    @NotBlank
    private String texte;

    @NotBlank
    private String bonneReponse;

    @NotNull
    private Long quizId;

    public String getTexte(){
        return texte;
    }

    public void setTexte(String texte){
        this.texte = texte;
    }

    public String getBonneReponse(){
        return bonneReponse;
    }

    public Long getQuizId(){
        return quizId;
    }

}


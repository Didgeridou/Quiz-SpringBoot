package com.quiz.api.dto;

import com.quiz.api.entity.Reponse;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ReponseRequest {

    @NotBlank
    private String texte;

    private boolean correcte;

    @NotNull
    private Long questionId;

    public String getTexte(){
        return texte;
    }

    public void setTexte(String texte){
        this.texte = texte;
    }

    public boolean getCorrecte(){
        return correcte;
    }

    public void setCorrecte(Reponse.Position position){
        this.correcte = true;
    }
}

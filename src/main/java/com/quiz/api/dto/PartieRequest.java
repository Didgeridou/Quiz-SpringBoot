package com.quiz.api.dto;

import jakarta.validation.constraints.NotNull;

public class PartieRequest {

    @NotNull
    private Long joueurId;

    @NotNull
    private Long quizId;

    @NotNull
    private int score = 0;

    public Long getJoueurId(){
        return joueurId;
    }

    public Long getQuizId(){
        return quizId;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }


}

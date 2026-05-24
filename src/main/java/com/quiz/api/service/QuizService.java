package com.quiz.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.api.dto.QuizRequest;
import com.quiz.api.entity.Quiz;
import com.quiz.api.entity.Redacteur;
import com.quiz.api.repository.QuizRepository;
import com.quiz.api.repository.RedacteurRepository;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    private RedacteurRepository redacteurRepository;

    public List<Quiz> getAll(){
        return quizRepository.findAll();
    }

    public Optional<Quiz> getById(Long id){
        return quizRepository.findById(id);
    }

    public Quiz create(QuizRequest request) {

        Redacteur redacteur = redacteurRepository.findById(request.getRedacteurId())
            .orElseThrow(() -> new RuntimeException("Rédacteur introuvable"));

        Quiz quiz = new Quiz();
        quiz.setNom(request.getNom());
        quiz.setCategorie(request.getCategorie());
        quiz.setRedacteur(redacteur);

        return quizRepository.save(quiz);
    }

    public boolean delete(Long id){
        if(quizRepository.existsById(id)){
            quizRepository.deleteById(id);
            return true;
        }
        return false;
    }


    
}

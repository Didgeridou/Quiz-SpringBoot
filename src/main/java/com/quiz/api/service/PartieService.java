package com.quiz.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.api.dto.PartieRequest;
import com.quiz.api.entity.Joueur;
import com.quiz.api.entity.Partie;
import com.quiz.api.entity.Quiz;
import com.quiz.api.repository.JoueurRepository;
import com.quiz.api.repository.PartieRepository;
import com.quiz.api.repository.QuizRepository;

@Service
public class PartieService {

    @Autowired
    private PartieRepository partieRepository;

    @Autowired
    private JoueurRepository joueurRepository;

    @Autowired
    private QuizRepository quizRepository;

    public List<Partie> getAll(){
        return partieRepository.findAll();
    }

    public Optional<Partie> getById(Integer id){
        return partieRepository.findById(id);
    }

    public Partie create(PartieRequest request) {

        Joueur joueur = joueurRepository.findById(request.getJoueurId())
            .orElseThrow(() -> new RuntimeException("Joueur introuvable"));

        Quiz quiz = quizRepository.findById(request.getQuizId())
            .orElseThrow(() -> new RuntimeException("Quiz introuvable"));

        Partie partie = new Partie();
        partie.setScore(request.getScore());
        partie.setJoueurs(List.of(joueur));
        partie.setQuizList(List.of(quiz));

        return partieRepository.save(partie);
    }


    public boolean delete(Integer id){
        if (partieRepository.existsById(id)){
            partieRepository.deleteById(id);
            return true;
        }
        return false;
    }
    
}

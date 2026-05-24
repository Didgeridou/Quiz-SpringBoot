package com.quiz.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.api.entity.Joueur;
import com.quiz.api.repository.JoueurRepository;

@Service
public class JoueurService {

    @Autowired
    private JoueurRepository joueurRepository;

    public List<Joueur> getAll(){
        return joueurRepository.findAll();
    }

    public Optional<Joueur> getById(String id){
        return joueurRepository.findById(id);
    }

    public Joueur create(Joueur joueur){
        return joueurRepository.save(joueur);
    }

    public boolean delete(String id){
        if(joueurRepository.existsById(id)){
            joueurRepository.deleteById(id);
            return true;
        }
        return false;
    }
    
}

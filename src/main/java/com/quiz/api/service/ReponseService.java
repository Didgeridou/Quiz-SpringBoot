package com.quiz.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.quiz.api.entity.Reponse;
import com.quiz.api.repository.ReponseRepository;

public class ReponseService {
    
    @Autowired
    private ReponseRepository reponseRepository;

    public List<Reponse> getAll(){
        return reponseRepository.findAll();
    }

    public Optional<Reponse> getById(Long id){
        return reponseRepository.findById(id);
    }

    public Reponse create(Reponse reponse){
        return reponseRepository.save(reponse);
    }

    public boolean delete(Long id){
        if (reponseRepository.existsById(id)){
            reponseRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

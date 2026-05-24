package com.quiz.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.quiz.api.entity.Redacteur;
import com.quiz.api.repository.RedacteurRepository;

public class RedacteurService {
    
    @Autowired
    private RedacteurRepository redacteurRepository;

    public List<Redacteur> getAll(){
        return redacteurRepository.findAll();
    }

    public boolean getById(Long id){
        return redacteurRepository.existsById(id);
    }

    public Redacteur create(Redacteur redacteur){
        return redacteurRepository.save(redacteur);
    }

    public boolean delete(Long id){
        if (redacteurRepository.existsById(id)){
            redacteurRepository.deleteById(id);
            return true;
        }
        
        return false;
    }
}

package com.quiz.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.api.entity.Partie;
import com.quiz.api.repository.PartieRepository;

@Service
public class PartieService {

    @Autowired
    private PartieRepository partieRepository;

    public List<Partie> getAll(){
        return partieRepository.findAll();
    }

    public Optional<Partie> getById(Integer id){
        return partieRepository.findById(id);
    }

    public Partie create(Partie partie){
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

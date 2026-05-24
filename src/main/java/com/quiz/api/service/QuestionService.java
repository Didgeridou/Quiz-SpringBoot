package com.quiz.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.api.entity.Question;
import com.quiz.api.repository.QuestionRepository;

@Service
public class QuestionService {
    
    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAll(){
        return questionRepository.findAll();
    }

    public Optional<Question> getById(Long id){
        return questionRepository.findById(id);
    }

    public Question create(Question newQuestion) {
        return questionRepository.save(newQuestion);
    }

    public boolean delete(Long id){
        if (questionRepository.existsById(id)){
            questionRepository.deleteById(id);
            return true;
        }
        return false;
    }

}

package com.example.curriculum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.curriculum.model.Curriculum;
import com.example.curriculum.repository.CurriculumRepository;

@Service
public class CurriculumService {

    @Autowired
    CurriculumRepository repository;
    
    public List<Curriculum> getAll(){
        return repository.findAll();
    }
    public void insertACurriculum(Curriculum c){
        repository.save(c);
    }
    public void deleteCurriculum(int id){
        repository.deleteById(id);
    }
}

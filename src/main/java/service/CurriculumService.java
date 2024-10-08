package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.CurriculumModel;
import repository.CurriculumRepository;

@Service
public class CurriculumService {
    @Autowired
    CurriculumRepository repository;

    public List<CurriculumModel> getAll(){
        return repository.findAll();
    }

    public void insertCurriculum(CurriculumModel c){
        repository.save(c);
    }

    public void deleteCurriculum(int id){
        repository.deleteById(id);
    }
}

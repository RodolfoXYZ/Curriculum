package com.example.curriculum.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.curriculum.model.Curriculum;
import com.example.curriculum.service.CurriculumService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RestController
public class CurriculoController {
    @Autowired
    CurriculumService service;


    @PostMapping("/create")
    public int insert(@RequestBody Curriculum entity) {
        try{
            service.insertACurriculum(entity);
            return 1;
        }
        catch(Exception e){
            return 0;
        }
    }
    @GetMapping("/getAll")
    public List<Curriculum> select() {
        
            return service.getAll();
        
    }
    
    @DeleteMapping("/delete")
    public boolean delete(@RequestParam int id) {
        try{
            service.deleteCurriculum(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    
}

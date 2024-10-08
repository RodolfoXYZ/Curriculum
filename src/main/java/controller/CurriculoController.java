package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.CurriculumModel;
import service.CurriculumService;


@CrossOrigin(origins = "*")
@RestController
public class CurriculoController {
    @Autowired
    CurriculumService service;


    @PostMapping("/create")
    public int insert(@RequestBody CurriculumModel entity) {
        try{
            service.insertCurriculum(entity);
            return 1;
        }
        catch(Exception e){
            return 0;
        }
    }
    @GetMapping("/getAll")
    public List<CurriculumModel> select() {
        
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
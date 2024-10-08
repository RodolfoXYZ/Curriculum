package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.CurriculumModel;

@Repository
public interface CurriculumRepository extends JpaRepository<CurriculumModel, Integer>{
    
}

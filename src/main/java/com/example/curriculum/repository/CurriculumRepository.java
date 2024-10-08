package com.example.curriculum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curriculum.model.Curriculum;

@Repository
public interface CurriculumRepository extends JpaRepository<Curriculum, Integer> {
}

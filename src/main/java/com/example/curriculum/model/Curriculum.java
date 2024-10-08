package com.example.curriculum.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class Curriculum {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nome;
    String CEP;
    String nationality;
    String district;
    Integer number;
    String complement;
    String email;
    String phoneNumber;
    String linkedin;
}

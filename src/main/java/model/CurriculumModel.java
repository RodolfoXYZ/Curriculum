package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table

public class CurriculumModel {
    int id;
    String name;
    String CEP;
    String nationality;
    String district;
    int number;
    String complement;
    String email;
    String phoneNumber;
    String linkedIn;
}

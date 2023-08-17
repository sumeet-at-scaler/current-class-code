package com.example.bms_fair_begin.models;

import com.example.bms_fair_begin.models.enums.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Actor extends BaseModel {
    private String name;

    @Enumerated(EnumType.ORDINAL)
    private Gender gender;

    @ManyToMany
    private List<Movie> movies;
}

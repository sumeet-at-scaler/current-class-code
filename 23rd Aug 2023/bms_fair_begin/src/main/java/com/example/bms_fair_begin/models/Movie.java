package com.example.bms_fair_begin.models;

import com.example.bms_fair_begin.models.enums.Features;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;
    // in minutes
    private int duration;

    @OneToMany(mappedBy = "movie")
    private List<MovieShow> shows;

    @ManyToMany(mappedBy = "movies")
    private List<Actor> actors;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Features> requiredFeatures;
}


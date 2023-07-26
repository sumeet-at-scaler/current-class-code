package com.example.scaler.bms_fair_inter.models;

import com.example.scaler.bms_fair_inter.models.enums.Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int num_rows;
    private int num_columns;

    @ManyToOne
    private Theatre theatre;

    @OneToMany(mappedBy = "auditorium")
    private List<Seat> seats;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> supportedFeatures;

    @OneToMany(mappedBy = "auditorium")
    private List<MovieShow> shows;
}

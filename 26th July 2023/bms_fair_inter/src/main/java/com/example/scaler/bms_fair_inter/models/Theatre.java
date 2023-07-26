package com.example.scaler.bms_fair_inter.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel {
    private String name;
    private String address;
    private int maxSeatsBookingAllowed;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "theatre")
    private List<Auditorium> auditoriums;
}

package com.example.scaler.bms_fair_inter.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    private Date bookingTime;

    @OneToMany(mappedBy = "ticket")
    private List<Payment> payments;

    @OneToMany(mappedBy = "ticket")
    private List<SeatInShow> seats;

    @ManyToOne
    private User bookedBy;
}


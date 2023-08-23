package com.example.bms_fair_begin.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    private int amount;
    private Date bookingTime;

    @ManyToOne
    private User bookedBy;

    @OneToMany(mappedBy = "ticket")
    private List<SeatInShow> selectedSeats;

    @OneToOne(mappedBy = "ticket")
    private Payment payment;
}




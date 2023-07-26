package com.example.scaler.bms_fair_inter.models;

import com.example.scaler.bms_fair_inter.models.enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class SeatInShow extends BaseModel {

    @Enumerated(EnumType.ORDINAL)
    private SeatStatus seatStatus;

    @ManyToOne
    private Seat seat;

    @ManyToOne
    private MovieShow show;

    @ManyToOne
    private Ticket ticket;

    private Date statusUpdatedAt;
}

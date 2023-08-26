package com.example.bms_fair_begin.models;

import com.example.bms_fair_begin.models.enums.SeatStatus;
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


    @ManyToOne
    private Seat seat;

    @ManyToOne
    private MovieShow show;

    @Enumerated(EnumType.ORDINAL)
    private SeatStatus seatStatus;

    private Date lockedAt;

    @ManyToOne
    private Ticket ticket;
}






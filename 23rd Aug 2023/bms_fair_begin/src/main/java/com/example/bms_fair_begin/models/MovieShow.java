package com.example.bms_fair_begin.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="ms")
public class MovieShow extends BaseModel {
    private Date startTime;
    private Date endTime;

    // in minutes
    private int lockingTimeout;

    private int maxTicketsBookingAllowed;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Auditorium auditorium;

    @OneToMany(mappedBy = "show")
    private List<SeatInShow> seatInShows;

    @OneToMany(mappedBy = "show")
    private List<SeatTypeInShow> seatTypesInShow;
}





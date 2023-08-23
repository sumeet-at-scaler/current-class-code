package com.example.bms_fair_begin.repositories;

import com.example.bms_fair_begin.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    @Override
    Ticket save(Ticket entity);
}

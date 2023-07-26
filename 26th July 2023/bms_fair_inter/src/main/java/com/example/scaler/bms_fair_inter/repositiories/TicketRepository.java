package com.example.scaler.bms_fair_inter.repositiories;

import com.example.scaler.bms_fair_inter.models.Ticket;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    @Override
    Ticket save(Ticket entity);
}

package com.example.scaler.bms_fair_inter.repositiories;

import com.example.scaler.bms_fair_inter.models.SeatInShow;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<SeatInShow, Long> {
    @Override
    SeatInShow save(SeatInShow entity);

    @Override
    @Lock(LockModeType.PESSIMISTIC_READ)
    List<SeatInShow> findAllById(Iterable<Long> longs);
}

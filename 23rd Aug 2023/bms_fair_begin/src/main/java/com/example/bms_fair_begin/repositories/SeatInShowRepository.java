package com.example.bms_fair_begin.repositories;

import com.example.bms_fair_begin.models.SeatInShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatInShowRepository extends JpaRepository<SeatInShow, Long> {
    @Override
    List<SeatInShow> findAllById(Iterable<Long> longs);

    @Override
    SeatInShow save(SeatInShow entity);
}

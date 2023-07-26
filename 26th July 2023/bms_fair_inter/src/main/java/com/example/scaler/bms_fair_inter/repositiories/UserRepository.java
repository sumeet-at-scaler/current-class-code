package com.example.scaler.bms_fair_inter.repositiories;

import com.example.scaler.bms_fair_inter.models.User;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    @Lock(LockModeType.PESSIMISTIC_READ)
    Optional<User> findById(Long aLong);
}

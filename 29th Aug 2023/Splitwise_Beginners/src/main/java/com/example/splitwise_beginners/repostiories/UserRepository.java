package com.example.splitwise_beginners.repostiories;

import com.example.splitwise_beginners.models.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.function.Function;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    User save(User entity);

    @Override
    Optional<User> findById(Long aLong);
}

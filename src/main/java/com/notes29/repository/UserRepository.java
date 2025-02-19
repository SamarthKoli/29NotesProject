package com.notes29.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notes29.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);
}
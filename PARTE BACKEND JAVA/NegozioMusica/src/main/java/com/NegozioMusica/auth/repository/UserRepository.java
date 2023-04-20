package com.NegozioMusica.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NegozioMusica.auth.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    Optional<User> findBySurnameOrEmail(String surname, String email);

    Boolean existsByEmail(String email);
}

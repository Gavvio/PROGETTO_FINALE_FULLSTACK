package com.NegozioMusica.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NegozioMusica.main.entities.Articolo;

public interface ArticoloRepository extends JpaRepository<Articolo, Long> {

}

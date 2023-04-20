package com.NegozioMusica.main.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NegozioMusica.main.entities.ChitarraClassica;
import com.NegozioMusica.main.utils.ChitarreClassiche;

public interface ChitarraClassicaRepository extends JpaRepository<ChitarraClassica, Long> {

	List<ChitarraClassica> findByTipoClassica(ChitarreClassiche tipoClassica);
}

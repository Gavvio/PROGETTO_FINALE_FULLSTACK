package com.NegozioMusica.main.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NegozioMusica.main.entities.ChitarraAcustica;
import com.NegozioMusica.main.utils.ChitarreAcustiche;

public interface ChitarraAcusticaRepository extends JpaRepository<ChitarraAcustica, Long> {
	
	List<ChitarraAcustica> findByTipoAcustica(ChitarreAcustiche tipoAcustica);
}

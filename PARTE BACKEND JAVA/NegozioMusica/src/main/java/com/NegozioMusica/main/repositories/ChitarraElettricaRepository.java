package com.NegozioMusica.main.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NegozioMusica.main.entities.ChitarraElettrica;
import com.NegozioMusica.main.utils.ChitarreElettriche;

public interface ChitarraElettricaRepository extends JpaRepository<ChitarraElettrica, Long> {

	
	List<ChitarraElettrica> findByTipoElettrica(ChitarreElettriche tipoElettrica);
}

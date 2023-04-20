package com.NegozioMusica.main.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NegozioMusica.main.entities.Corda;
import com.NegozioMusica.main.utils.TipoCorde;

public interface CordaRepository extends JpaRepository<Corda, Long> {

	List<Corda> findByTipoCorde(TipoCorde tipoCorde);
}

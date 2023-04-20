package com.NegozioMusica.main.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NegozioMusica.main.entities.Amplificatore;
import com.NegozioMusica.main.entities.Corda;
import com.NegozioMusica.main.utils.TipoAmplificatore;

public interface AmplificatoreRepository extends JpaRepository<Amplificatore, Long> {

	List<Corda> findByTipoAmplificatore(TipoAmplificatore tipoAmplificatore);
}

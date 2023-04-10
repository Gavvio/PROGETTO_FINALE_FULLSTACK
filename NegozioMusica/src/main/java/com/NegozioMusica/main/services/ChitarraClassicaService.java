package com.NegozioMusica.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NegozioMusica.main.entities.ChitarraClassica;
import com.NegozioMusica.main.repositories.ChitarraClassicaRepository;

@Service
public class ChitarraClassicaService {

	@Autowired
	ChitarraClassicaRepository chitRepo;

	public ChitarraClassica chitarraCLassicaGetById(Long id) {
		return chitRepo.getById(id);
	}

	public void chitarraClassicaSalvaAggiorna(ChitarraClassica ch) {
		chitRepo.save(ch);
		System.out.println("chitarra classica salvata");
	}

	public void chitarraClassicaRimuoviById(Long id) {
		chitRepo.deleteById(id);
		System.out.println("chitarra classica rimossa");
	}

	public List<ChitarraClassica> chitarraClassicaGetAll() {
		return chitRepo.findAll();
	}
	
}

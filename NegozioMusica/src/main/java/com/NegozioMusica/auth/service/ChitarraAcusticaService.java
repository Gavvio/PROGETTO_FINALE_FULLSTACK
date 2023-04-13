package com.NegozioMusica.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NegozioMusica.main.entities.ChitarraAcustica;
import com.NegozioMusica.main.repositories.ChitarraAcusticaRepository;

@Service
public class ChitarraAcusticaService {

	@Autowired
	ChitarraAcusticaRepository chitRepo;

	public ChitarraAcustica chitarraAcusticaGetById(Long id) {
		return chitRepo.findById(id).get();
	}

	public void chitarraAcusticaSalvaAggiorna(ChitarraAcustica ch) {
		chitRepo.save(ch);
		System.out.println("chitarra acustica salvata");
	}

	public void chitarraAcusticaRimuoviById(Long id) {
		chitRepo.deleteById(id);
		System.out.println("chitarra acustica rimossa");
	}

	public List<ChitarraAcustica> chitarraAcusticaGetAll() {
		return chitRepo.findAll();
	}
}

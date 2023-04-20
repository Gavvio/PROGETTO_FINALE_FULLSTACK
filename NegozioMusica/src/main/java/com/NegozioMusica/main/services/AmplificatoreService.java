package com.NegozioMusica.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NegozioMusica.main.entities.Amplificatore;
import com.NegozioMusica.main.entities.Corda;
import com.NegozioMusica.main.repositories.AmplificatoreRepository;

@Service
public class AmplificatoreService {

	@Autowired
	AmplificatoreRepository ampRepo;
	
	public Amplificatore ampGetById(Long id) {
		return ampRepo.findById(id).get();
	}

	public void ampSalvaAggiorna(Amplificatore am) {
		ampRepo.save(am);
		System.out.println("amplificatore salvato");
	}

	public void ampRimuoviById(Long id) {
		ampRepo.deleteById(id);
		System.out.println("amplificatore rimosso");
	}

	public List<Amplificatore> ampGetAll() {
		return ampRepo.findAll();
	}
}

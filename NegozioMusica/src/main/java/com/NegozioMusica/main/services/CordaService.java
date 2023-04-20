package com.NegozioMusica.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NegozioMusica.main.entities.Corda;
import com.NegozioMusica.main.repositories.CordaRepository;

@Service
public class CordaService {

	@Autowired
	CordaRepository cordRepo;
	
	public Corda cordaGetById(Long id) {
		return cordRepo.findById(id).get();
	}

	public void cordaSalvaAggiorna(Corda ch) {
		cordRepo.save(ch);
		System.out.println("corda salvata");
	}

	public void cordaRimuoviById(Long id) {
		cordRepo.deleteById(id);
		System.out.println("corda rimossa");
	}

	public List<Corda> cordaGetAll() {
		return cordRepo.findAll();
	}
}

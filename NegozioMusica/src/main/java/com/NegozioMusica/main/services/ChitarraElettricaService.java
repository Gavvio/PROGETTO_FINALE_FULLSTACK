package com.NegozioMusica.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NegozioMusica.main.entities.ChitarraElettrica;
import com.NegozioMusica.main.repositories.ChitarraElettricaRepository;

@Service
public class ChitarraElettricaService {

	@Autowired
	ChitarraElettricaRepository chitRepo;

	public ChitarraElettrica chitarraElettricaGetById(Long id) {
		return chitRepo.getById(id);
	}

	public void chitarraElettricaSalvaAggiorna(ChitarraElettrica ch) {
		chitRepo.save(ch);
		System.out.println("chitarra elettrica salvata");
	}

	public void chitarraElettricaRimuoviById(Long id) {
		chitRepo.deleteById(id);
		System.out.println("chitarra elettrica rimossa");
	}

	public List<ChitarraElettrica> chitarraElettricaGetAll() {
		return chitRepo.findAll();
	}

}

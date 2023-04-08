package com.NegozioMusica.main.runners;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.NegozioMusica.main.entities.ChitarraElettrica;
import com.NegozioMusica.main.services.ChitarraElettricaService;

@Component
public class PopolazioneDatabase {
	
	@Autowired
	ChitarraElettricaService elchitServ;

	public ChitarraElettrica creaChitarraElettrica(Map<String, String> map, String[] keys) {
		ChitarraElettrica c= new ChitarraElettrica();
		
		
		return c;
	}

}

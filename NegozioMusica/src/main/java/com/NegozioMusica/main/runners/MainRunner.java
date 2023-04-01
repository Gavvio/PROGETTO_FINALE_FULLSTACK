package com.NegozioMusica.main.runners;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.NegozioMusica.main.entities.ChitarraElettrica;
import com.NegozioMusica.main.services.ChitarraElettricaService;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Component
public class MainRunner implements ApplicationRunner {
	@Autowired
	ChitarraElettricaService elchitServ;

	void creaChitarraElettrica(String colore,String corde, String controlli, String corpo, String inlay, String larghezza, String lunghezza, String manico, String pickup, int tasti, String tastiera, double prezzo, String modello) {
		ChitarraElettrica chitmom = new ChitarraElettrica();
		chitmom.setColore(colore);
		chitmom.setCorde(corde);
		chitmom.setControlli(controlli);
		chitmom.setCorpo(corpo);
		chitmom.setInlay(inlay);
		chitmom.setLarghezza_scala(larghezza);	
		chitmom.setLunghezza_scala(lunghezza);
		chitmom.setManico(manico);
		chitmom.setPickup(pickup);
		chitmom.setPrezzo(prezzo);
		chitmom.setTasti(tasti);
		chitmom.setTastiera(tastiera);
		chitmom.setModello(modello);
		elchitServ.chitarraElettricaSalvaAggiorna(chitmom);
		}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("main runner on");
		
		//creaChitarraElettrica("bianco vintage lucido",".010-.046","1 volume, 1 tono","mogano","bianchi","42mm","628mm","mogano incollatura singola","humbucker attivi EMG81 (ponte) e EMG60 (manico)",22,"ebano",399,"Harley Benton EX-84 Modern EMG VW");
		Map config = new HashMap<>();
		config.put("cloud_name", "dom3joacd");
		config.put("api_key", "417758232477746");
		config.put("api_secret", "bqa5mtXdJDZsvFLalHAQwaor-xY");
		Cloudinary cloudinary = new Cloudinary(config);
		try {
			  cloudinary.uploader().upload("C:\\Users\\steve\\OneDrive\\Desktop\\PROGETTO_FINALE_FULLSTACK\\immagini progetto\\immagini categorie", ObjectUtils.asMap("public_id", "categoria_chitarre"));
			} catch (IOException exception) {
			  System.out.println(exception.getMessage());
			}
		
		
	}

}

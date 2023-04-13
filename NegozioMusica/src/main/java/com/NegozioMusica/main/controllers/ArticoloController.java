package com.NegozioMusica.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NegozioMusica.auth.entity.User;
import com.NegozioMusica.auth.repository.UserRepository;
import com.NegozioMusica.auth.security.JwtTokenProvider;
import com.NegozioMusica.main.entities.Articolo;
import com.NegozioMusica.main.entities.ChitarraAcustica;
import com.NegozioMusica.main.entities.ChitarraClassica;
import com.NegozioMusica.main.entities.ChitarraElettrica;
import com.NegozioMusica.main.repositories.ArticoloRepository;
import com.NegozioMusica.main.repositories.ChitarraAcusticaRepository;
import com.NegozioMusica.main.repositories.ChitarraClassicaRepository;
import com.NegozioMusica.main.repositories.ChitarraElettricaRepository;
import com.NegozioMusica.main.utils.ChitarreAcustiche;
import com.NegozioMusica.main.utils.ChitarreClassiche;
import com.NegozioMusica.main.utils.ChitarreElettriche;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/articolo")
public class ArticoloController {

	@Autowired
	ArticoloRepository articoloRepo;
	@Autowired
	ChitarraElettricaRepository elettricaRepo;
	@Autowired
	ChitarraClassicaRepository classicaRepo;
	@Autowired
	ChitarraAcusticaRepository acusticaRepo;
	@Autowired
	JwtTokenProvider jwtProv;
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/{id}")
	public ResponseEntity<Articolo> ottieniArticoloById(@PathVariable Long id){
		return new ResponseEntity<Articolo>(articoloRepo.findById(id).get(),HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Articolo>> ottieniTuttiArticoli(){
		return new ResponseEntity<List<Articolo>>(articoloRepo.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_elettriche/stratocaster")
	public ResponseEntity<List<ChitarraElettrica>> ottieniTutteStratocaster(){
		return new ResponseEntity<List<ChitarraElettrica>>(elettricaRepo.findByTipoElettrica(ChitarreElettriche.STRATOCASTER),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_elettriche/telecaster")
	public ResponseEntity<List<ChitarraElettrica>> ottieniTutteTelecaster(){
		return new ResponseEntity<List<ChitarraElettrica>>(elettricaRepo.findByTipoElettrica(ChitarreElettriche.TELECASTER),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_elettriche/singlecut")
	public ResponseEntity<List<ChitarraElettrica>> ottieniTutteSingleCut(){
		return new ResponseEntity<List<ChitarraElettrica>>(elettricaRepo.findByTipoElettrica(ChitarreElettriche.SINGLECUT),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_elettriche/doublecut")
	public ResponseEntity<List<ChitarraElettrica>> ottieniTutteDoubleCut(){
		return new ResponseEntity<List<ChitarraElettrica>>(elettricaRepo.findByTipoElettrica(ChitarreElettriche.DOUBLECUT),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_elettriche/semiacustiche")
	public ResponseEntity<List<ChitarraElettrica>> ottieniTutteSemiAcustiche(){
		return new ResponseEntity<List<ChitarraElettrica>>(elettricaRepo.findByTipoElettrica(ChitarreElettriche.SEMIACUSTICHE),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_elettriche/heavy")
	public ResponseEntity<List<ChitarraElettrica>> ottieniTutteHeavy(){
		return new ResponseEntity<List<ChitarraElettrica>>(elettricaRepo.findByTipoElettrica(ChitarreElettriche.HEAVY),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_classiche/1-8")
	public ResponseEntity<List<ChitarraClassica>>ottieniTutteUnOttavo(){
		return new ResponseEntity<List<ChitarraClassica>>(classicaRepo.findByTipoClassica(ChitarreClassiche.UNOTTAVO),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_classiche/1-4")
	public ResponseEntity<List<ChitarraClassica>>ottieniTutteUnQuarto(){
		return new ResponseEntity<List<ChitarraClassica>>(classicaRepo.findByTipoClassica(ChitarreClassiche.UNQUARTO),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_classiche/1-2")
	public ResponseEntity<List<ChitarraClassica>>ottieniTutteUnMezzo(){
		return new ResponseEntity<List<ChitarraClassica>>(classicaRepo.findByTipoClassica(ChitarreClassiche.UNMEZZO),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_classiche/3-4")
	public ResponseEntity<List<ChitarraClassica>>ottieniTutteTreQuarti(){
		return new ResponseEntity<List<ChitarraClassica>>(classicaRepo.findByTipoClassica(ChitarreClassiche.TREQUARTI),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_classiche/7-8")
	public ResponseEntity<List<ChitarraClassica>>ottieniTutteSetteOttavi(){
		return new ResponseEntity<List<ChitarraClassica>>(classicaRepo.findByTipoClassica(ChitarreClassiche.SETTEOTTAVI),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_classiche/4-4")
	public ResponseEntity<List<ChitarraClassica>>ottieniTutteQuattroQuarti(){
		return new ResponseEntity<List<ChitarraClassica>>(classicaRepo.findByTipoClassica(ChitarreClassiche.QUATTROQUARTI),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_acustiche/dreadnought")
	public ResponseEntity<List<ChitarraAcustica>>ottieniTutteDreadnought(){
		return new ResponseEntity<List<ChitarraAcustica>>(acusticaRepo.findByTipoAcustica(ChitarreAcustiche.DREADNOUGHT),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_acustiche/jumbo")
	public ResponseEntity<List<ChitarraAcustica>>ottieniTutteJumbo(){
		return new ResponseEntity<List<ChitarraAcustica>>(acusticaRepo.findByTipoAcustica(ChitarreAcustiche.JUMBO),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_acustiche/folk")
	public ResponseEntity<List<ChitarraAcustica>>ottieniTutteFolk(){
		return new ResponseEntity<List<ChitarraAcustica>>(acusticaRepo.findByTipoAcustica(ChitarreAcustiche.FOLK),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_acustiche/ooooo")
	public ResponseEntity<List<ChitarraAcustica>>ottieniTutteOoooo(){
		return new ResponseEntity<List<ChitarraAcustica>>(acusticaRepo.findByTipoAcustica(ChitarreAcustiche.OOOOOO),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_acustiche/roundback")
	public ResponseEntity<List<ChitarraAcustica>>ottieniTutteRoundback(){
		return new ResponseEntity<List<ChitarraAcustica>>(acusticaRepo.findByTipoAcustica(ChitarreAcustiche.ROUNDBACK),HttpStatus.OK);
	}
	
	@GetMapping("/chitarre_acustiche/daviaggio")
	public ResponseEntity<List<ChitarraAcustica>>ottieniTutteDaViaggio(){
		return new ResponseEntity<List<ChitarraAcustica>>(acusticaRepo.findByTipoAcustica(ChitarreAcustiche.DAVIAGGIO),HttpStatus.OK);
	}
	
	@GetMapping("/preferiti")
	public ResponseEntity<List<Articolo>> ottieniPreferitiUtente(@RequestHeader(name="Authorization",required = false) String jwt){
		String mailTest=jwtProv.getEmailWithoutBearer(jwt);
		User user=userRepository.findByEmail(mailTest);
		System.out.println(user);
		System.out.println(user.getArticoli());
		return new ResponseEntity<List<Articolo>>(user.getArticoli(), HttpStatus.OK);
	}
	
	@GetMapping("/carrello")
	public ResponseEntity<List<Articolo>> ottieniCarrelloUtente(@RequestHeader(name="Authorization",required = false) String jwt){
		String mailTest=jwtProv.getEmailWithoutBearer(jwt);
		User user=userRepository.findByEmail(mailTest);
		System.out.println(user);
		System.out.println(user.getCarrello());
		return new ResponseEntity<List<Articolo>>(user.getCarrello(), HttpStatus.OK);
	}
	
	@PostMapping("/preferiti/{id}")
	public ResponseEntity<User> updateAddUser(@PathVariable Long id,@RequestHeader(name="Authorization",required = false) String jwt) {
		System.out.println("ciao");
		String mailTest=jwtProv.getEmailWithoutBearer(jwt);
		User user=userRepository.findByEmail(mailTest);
		System.out.println(user);
		System.out.println(id);
		List<Articolo> articoliUser=user.getArticoli();
		List<Articolo> articoli=articoloRepo.findAll();
		int mom=0;
		boolean controllo=true;
		for(int i=0;i<articoli.size();i++) {
			if(articoli.get(i).getId()==id) {
				System.out.println("articolo trovato");
				mom=i;
			}
		}
		for(int i=0;i<articoliUser.size();i++) {
			if(articoliUser.get(i).getId()==id) {
				System.out.println("articolo già nei preferiti");
				controllo=false;
			}
		}
		if(controllo) {
			Articolo articolo=articoli.get(mom);
			System.out.println(articolo);
			articoliUser.add(articolo);
			System.out.println(articoliUser);
			user.setArticoli(articoliUser);
			System.out.println(user);
		}
		
		return new ResponseEntity<User>(userRepository.save(user), HttpStatus.OK);
		
	}
	
	@PostMapping("/carrello/{id}")
	public ResponseEntity<User> updateAddUserCarrello(@PathVariable Long id,@RequestHeader(name="Authorization",required = false) String jwt) {
		System.out.println("ciao");
		String mailTest=jwtProv.getEmailWithoutBearer(jwt);
		User user=userRepository.findByEmail(mailTest);
		System.out.println(user);
		System.out.println(id);
		List<Articolo> carrelloUser=user.getCarrello();
		List<Articolo> articoli=articoloRepo.findAll();
		int mom=0;
		boolean controllo=true;
		for(int i=0;i<articoli.size();i++) {
			if(articoli.get(i).getId()==id) {
				System.out.println("articolo trovato");
				mom=i;
			}
		}
		for(int i=0;i<carrelloUser.size();i++) {
			if(carrelloUser.get(i).getId()==id) {
				System.out.println("articolo già nel carrello");
				controllo=false;
			}
		}
		if(controllo) {
			Articolo articolo=articoli.get(mom);
			System.out.println(articolo);
			carrelloUser.add(articolo);
			System.out.println(carrelloUser);
			user.setCarrello(carrelloUser);
			System.out.println(user);
		}
		
		return new ResponseEntity<User>(userRepository.save(user), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/preferiti/{id}")
	public ResponseEntity<User> updateUserDeleteArticle(@PathVariable Long id,@RequestHeader(name="Authorization",required = false) String jwt) {
		String mailTest=jwtProv.getEmailWithoutBearer(jwt);
		User user=userRepository.findByEmail(mailTest);
		List<Articolo> articoli=user.getArticoli();
		int mom=0;
		for(int i=0;i<articoli.size();i++) {
			if(articoli.get(i).getId()==id) {
				System.out.println("articolo trovato ed eliminato");
				mom=i;
			}
		}
		articoli.remove(mom);
		user.setArticoli(articoli);
		return new ResponseEntity<User>(userRepository.save(user), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/carrello/{id}")
	public ResponseEntity<User> updateUserDeleteArticleCarrello(@PathVariable Long id,@RequestHeader(name="Authorization",required = false) String jwt) {
		String mailTest=jwtProv.getEmailWithoutBearer(jwt);
		User user=userRepository.findByEmail(mailTest);
		List<Articolo> articoliCarrello=user.getCarrello();
		int mom=0;
		for(int i=0;i<articoliCarrello.size();i++) {
			if(articoliCarrello.get(i).getId()==id) {
				System.out.println("articolo trovato ed eliminato");
				mom=i;
			}
		}
		articoliCarrello.remove(mom);
		user.setCarrello(articoliCarrello);
		return new ResponseEntity<User>(userRepository.save(user), HttpStatus.OK);
		
	}
}

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
import com.NegozioMusica.main.entities.Corda;
import com.NegozioMusica.main.repositories.ArticoloRepository;
import com.NegozioMusica.main.repositories.ChitarraAcusticaRepository;
import com.NegozioMusica.main.repositories.ChitarraClassicaRepository;
import com.NegozioMusica.main.repositories.ChitarraElettricaRepository;
import com.NegozioMusica.main.repositories.CordaRepository;
import com.NegozioMusica.main.utils.ChitarreAcustiche;
import com.NegozioMusica.main.utils.ChitarreClassiche;
import com.NegozioMusica.main.utils.ChitarreElettriche;
import com.NegozioMusica.main.utils.TipoCorde;

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
	CordaRepository cordaRepo;
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
	
	@GetMapping("/corde/08")
	public ResponseEntity<List<Corda>> ottieniTutte08(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.OTTO),HttpStatus.OK);
	}
	
	@GetMapping("/corde/09")
	public ResponseEntity<List<Corda>> ottieniTutte09(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.NOVE),HttpStatus.OK);
	}
	
	@GetMapping("/corde/10")
	public ResponseEntity<List<Corda>> ottieniTutte10(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.DIECI),HttpStatus.OK);
	}
	
	@GetMapping("/corde/11")
	public ResponseEntity<List<Corda>> ottieniTutte11(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.UNDICI),HttpStatus.OK);
	}
	
	@GetMapping("/corde/10acustiche")
	public ResponseEntity<List<Corda>> ottieniTutte10acustiche(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.DIECIACUSTICHE),HttpStatus.OK);
	}
	
	@GetMapping("/corde/11acustiche")
	public ResponseEntity<List<Corda>> ottieniTutte11acustiche(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.UNDICIACUSTICHE),HttpStatus.OK);
	}
	
	@GetMapping("/corde/12")
	public ResponseEntity<List<Corda>> ottieniTutte12(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.DODICI),HttpStatus.OK);
	}
	
	@GetMapping("/corde/13")
	public ResponseEntity<List<Corda>> ottieniTutte13(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.TREDICI),HttpStatus.OK);
	}
	
	@GetMapping("/corde/standard")
	public ResponseEntity<List<Corda>> ottieniTutteStandard(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.STANDARD),HttpStatus.OK);
	}
	
	@GetMapping("/corde/carbonio")
	public ResponseEntity<List<Corda>> ottieniTutteCarbonio(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.CARBONIO),HttpStatus.OK);
	}
	
	@GetMapping("/corde/steel")
	public ResponseEntity<List<Corda>> ottieniTutteSteel(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.STEEL),HttpStatus.OK);
	}
	
	@GetMapping("/corde/40")
	public ResponseEntity<List<Corda>> ottieniTutte40(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.QUARANTA),HttpStatus.OK);
	}
	
	@GetMapping("/corde/45")
	public ResponseEntity<List<Corda>> ottieniTutte45(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.QUARANTACINQUE),HttpStatus.OK);
	}
	
	@GetMapping("/corde/50")
	public ResponseEntity<List<Corda>> ottieniTutte50(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.CINQUANTA),HttpStatus.OK);
	}
	
	@GetMapping("/corde/40cinque")
	public ResponseEntity<List<Corda>> ottieniTutte40cinque(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.QUARANTACINQUECORDE),HttpStatus.OK);
	}
	
	@GetMapping("/corde/45cinque")
	public ResponseEntity<List<Corda>> ottieniTutte45cinque(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.QUARANTACINQUECINQUECORDE),HttpStatus.OK);
	}
	
	@GetMapping("/corde/acustici")
	public ResponseEntity<List<Corda>> ottieniTutteAcustici(){
		return new ResponseEntity<List<Corda>>(cordaRepo.findByTipoCorde(TipoCorde.ACUSTICI),HttpStatus.OK);
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
			carrelloUser.add(articolo);
			user.setCarrello(carrelloUser);
			System.out.println("articolo aggiunto al carrello");
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
		System.out.println(id);
		for(int i=0;i<articoliCarrello.size();i++) {
			if(articoliCarrello.get(i).getId()==id) {
				System.out.println("articolo trovato ed eliminato");
				articoliCarrello.remove(i);
			}
		}
		System.out.println(articoliCarrello);
		user.setCarrello(articoliCarrello);
		return new ResponseEntity<User>(userRepository.save(user), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/carrello/articoli/{ids}")
	public ResponseEntity<User> updateUserDeleteArticoliCarrello(@PathVariable List<Long> ids,@RequestHeader(name="Authorization",required = false) String jwt) {
		String mailTest=jwtProv.getEmailWithoutBearer(jwt);
		User user=userRepository.findByEmail(mailTest);
		List<Articolo> articoliCarrello=user.getCarrello();
		System.out.println(ids);
		for(int i=0;i<articoliCarrello.size();i++) {
			for(int a=0;a<ids.size();a++) {
				if(ids.get(a)==articoliCarrello.get(i).getId()) {
					System.out.println("articolo trovato ed eliminato");
					articoliCarrello.remove(i);
				}
			}
		}
		System.out.println(articoliCarrello);
		user.setCarrello(articoliCarrello);
		return new ResponseEntity<User>(userRepository.save(user), HttpStatus.OK);
		
	}
}

package com.NegozioMusica.auth.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.NegozioMusica.main.entities.ChitarraElettrica;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	UserRepository userRepository;
	@Autowired
	JwtTokenProvider jwtProv;

	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	@GetMapping("/auth")
	@PreAuthorize("isAuthenticated()")
	public String autenticatedAccess() {
		return "Autenticated Content.";
	}
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/mod")
	@PreAuthorize("hasRole('MODERATOR')")
	public String moderatorAccess() {
		return "Moderator Board.";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
	
	
	@PostMapping("user")
	public ResponseEntity<User> updateUser(@RequestBody ChitarraElettrica articolo,@RequestHeader(name="Authorization",required = false) String jwt) {
		
		String mailTest=jwtProv.getEmailWithoutBearer(jwt);
		System.out.println(mailTest);
		User user=userRepository.findByEmail(mailTest);
		System.out.println("ciao");
		System.out.println(articolo);
		List<Articolo> articoli=user.getArticoli();
		articoli.add(articolo);
		System.out.println(articoli);
		user.setArticoli(articoli);
		System.out.println(user);
		return new ResponseEntity<User>(userRepository.save(user), HttpStatus.OK);
		
	}

}

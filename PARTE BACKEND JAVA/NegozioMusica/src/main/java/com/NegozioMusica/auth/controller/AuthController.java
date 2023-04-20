package com.NegozioMusica.auth.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NegozioMusica.auth.entity.User;
import com.NegozioMusica.auth.payload.JWTAuthResponse;
import com.NegozioMusica.auth.payload.LoginDto;
import com.NegozioMusica.auth.payload.RegisterDto;
import com.NegozioMusica.auth.repository.UserRepository;
import com.NegozioMusica.auth.service.AuthService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

	private AuthService authService;
	@Autowired
	private UserRepository userRepo;

	public AuthController(AuthService authService) {
		this.authService = authService;
	}

	// Build Login REST API
	@PostMapping(value = { "/login", "/signin" })
	public ResponseEntity<JWTAuthResponse> login(@RequestBody LoginDto loginDto) {
		String token = authService.login(loginDto);

		JWTAuthResponse jwtAuthResponse = new JWTAuthResponse();
		jwtAuthResponse.setEmail(loginDto.getEmail());
		jwtAuthResponse.setAccessToken(token);

		System.out.println(loginDto.getEmail());
		User mom = userRepo.findByEmail(loginDto.getEmail());

		jwtAuthResponse.setName(mom.getName());
		jwtAuthResponse.setSurname(mom.getSurname());

		return ResponseEntity.ok(jwtAuthResponse);
	}

	// Build Register REST API
	@PostMapping(value = { "/register", "/signup" })
	public ResponseEntity<String> register(@RequestBody RegisterDto registerDto) {
		System.out.println(registerDto);
		String response = authService.register(registerDto);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
}

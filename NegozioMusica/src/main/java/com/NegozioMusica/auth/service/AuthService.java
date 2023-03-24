package com.NegozioMusica.auth.service;

import com.NegozioMusica.auth.payload.LoginDto;
import com.NegozioMusica.auth.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}

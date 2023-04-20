package com.NegozioMusica.auth.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JWTAuthResponse {
	private Long id;
	private String name;
	private String surname;
	private String email;
    private String accessToken;
    private String tokenType = "Bearer";
}

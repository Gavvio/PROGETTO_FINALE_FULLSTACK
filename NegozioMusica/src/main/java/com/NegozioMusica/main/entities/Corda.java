package com.NegozioMusica.main.entities;

import com.NegozioMusica.main.utils.TipoCorde;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
public class Corda  extends Articolo{
	@Column
	private String marca;
	@Column
	private String materiale;
	@Column
	private String gauge;
	@Column
	private String modello;
	@Column
	private String immagine;
	@Enumerated(EnumType.STRING)
	private TipoCorde tipoCorde;
}

package com.NegozioMusica.main.entities;

import com.NegozioMusica.main.utils.ChitarreAcustiche;
import com.NegozioMusica.main.utils.ChitarreClassiche;

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
public class ChitarraAcustica extends Articolo{
	@Column
	private String immagine;
	@Column
	private String colore;
	@Column
	private String lunghezza_scala;
	@Column
	private String larghezza_scala;
	@Column
	private String tastiera;
	@Column
	private String corpo;
	@Column
	private String marca;
	@Column
	private String modello;
	@Enumerated(EnumType.STRING)
	private ChitarreAcustiche tipoAcustica;
}

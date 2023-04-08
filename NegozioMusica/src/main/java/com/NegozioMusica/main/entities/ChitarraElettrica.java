package com.NegozioMusica.main.entities;

import java.util.Set;

import com.NegozioMusica.auth.entity.Role;
import com.NegozioMusica.main.utils.ChitarreElettriche;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
public class ChitarraElettrica extends Articolo{
	@Column
	private String colore;
	@Column
	private String lunghezza_scala;
	@Column
	private String larghezza_scala;
	@Column
	private String tastiera;
	@Column
	private String manico;
	@Column
	private String corpo;
	@Column
	private String marca;
	@Column
	private String modello;
	@Column
	private String inlay;
	@Column
	private int tasti;
	@Column
	private String pickup;
	@Column
	private String controlli;
	@Column
	private String tremolo;
	@Column
	private String immagine;
	@Enumerated(EnumType.STRING)
	private ChitarreElettriche tipoElettrica;
}

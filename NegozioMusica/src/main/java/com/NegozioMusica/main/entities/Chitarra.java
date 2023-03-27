package com.NegozioMusica.main.entities;

import java.util.Set;

import com.NegozioMusica.auth.entity.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public abstract class Chitarra extends Articolo{
@Column
private String corde;
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
private String modello;

}

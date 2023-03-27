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
@NoArgsConstructor
@ToString
@Entity
public class ChitarraElettrica extends Chitarra{
	@Column
	private String inlay;
	@Column
	private int tasti;
	@Column
	private String pickup;
	@Column
	private String controlli;
}

package com.tuempresa.vuelo2.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(name = "Simple", members = "numAsiento, costoBoleto; " +
                                 "persona")
public class Pasajero extends Superclass{
	
	@Column(length = 8)
	int numAsiento;
	
	@Column(length = 10)
	float costoBoleto;
	
	@ManyToOne
	@ReferenceView("Corta")
	Persona persona;
}
package com.tuempresa.vuelo2.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Aerolinea extends Superclass{
	
	@Column(length = 32)
	String nombre;
	

	@ManyToOne
	@DescriptionsList(descriptionProperties = "pais")
	Pais pais;

}

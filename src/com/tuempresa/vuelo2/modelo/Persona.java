package com.tuempresa.vuelo2.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(name = "Corta" , members = "nombres, apellidos; " +
                                 "fotografia")
public class Persona extends Superclass {
	
	@Column(length = 23)
	String nombres;
	
	@Column(length = 23)
	String apellidos;
	
	@File
	@Column(length = 32)
	String fotografia;
	
	@ManyToOne
	Direccion direccion;
}

package com.tuempresa.vuelo2.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Empleado {
	
	@Column(length = 64)
	String nombres;
	
	@Column(length = 64)
	String apellidos;
	
	@File
	@Column(length = 32)
	String fotografia;
	
	@ManyToOne
	Direccion direccion;
	
}

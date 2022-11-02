package com.tuempresa.vuelo2.modelo;



import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Tripulacion {
	
	@Column(length = 32)
	String nombre;
	
	@Column(length = 12)
	int numelementos;
	
	@ManyToOne
	@DescriptionsList
	Aerolinea aerolinea;
	
	@ManyToOne
	Empleado empleado;


}

package com.tuempresa.vuelo2.modelo;


import java.sql.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "anyo, hora; " +
                "ciudadOrigen, ciudadDestino; " +
		        "tripulacion, pasajero")
public class Vuelo extends Superclass{
	

	@DefaultValueCalculator(CurrentYearCalculator.class)
	@Column(length = 4)
	int anyo;
	
	@Required
	@Column(length = 5)
	Time hora;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@DescriptionsList(descriptionProperties = "origen")
	Origen ciudadOrigen;
	
	@ManyToOne(fetch = FetchType.LAZY , optional = true)
	@DescriptionsList(descriptionProperties = "destino")
	Destino ciudadDestino;
	
	
	@ManyToOne
	@DescriptionsList
	Tripulacion tripulacion;
	
	
	@ManyToOne
	@ReferenceView("Simple")
	Pasajero pasajero;
}
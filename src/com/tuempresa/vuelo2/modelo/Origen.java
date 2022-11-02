package com.tuempresa.vuelo2.modelo;


import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Origen extends Superclass{
	
	@Column(length = 50)
	String origen;

	
	
}

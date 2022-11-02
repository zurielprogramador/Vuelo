package com.tuempresa.vuelo2.modelo;


import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Pais extends Superclass{
	

	@Column(length = 50)
	String pais;


}

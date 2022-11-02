package com.tuempresa.vuelo2.modelo;
import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Aerolinea{
	
	@Column(length = 32)
	String nombre;
	

}

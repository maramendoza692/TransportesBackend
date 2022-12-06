package com.utng.controlAutobuses.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Destino {
	private Integer idAutobus;

	private String tipo;

	private String ruta;
	
	private String origen;
	
	private String destino;

	private String hora;
}

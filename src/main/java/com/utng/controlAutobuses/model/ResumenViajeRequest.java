package com.utng.controlAutobuses.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResumenViajeRequest {

	private Integer id_viaje;
	
	private String hora;
	
	private Date fecha;
	
	private Double total;
	
	private Integer id_origen;
	
	private Integer id_destino;

	private Integer id_paq;

}

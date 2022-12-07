package com.utng.controlAutobuses.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name= "RESUMEN_VIAJE")
public class ResumenViaje implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4117255755389547138L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_viaje")
	private Integer id_viaje;
	
	@Column(name="hora")
	private String hora;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="total")
	private Double total;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_origen")
	private Origen id_origen;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_destino")
	private Destino id_destino;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_paq")
	private Paquetes id_paq;
}

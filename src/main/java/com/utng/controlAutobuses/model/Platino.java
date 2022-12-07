package com.utng.controlAutobuses.model;

import java.io.Serializable;

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

@Getter
@Setter
@Entity
@Table(name= "PAQUETE_PLATINO")
public class Platino implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3738131902985475416L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_platino")
	private Integer id_platino;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="servicio1")
	private String  servicio1;
	
	@Column(name="servicio2")
	private String servicio2;

	
	@Column(name="precio_platino")
	private Double precio_platino;
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_transporte")
	private Transporte transporte;
	
}

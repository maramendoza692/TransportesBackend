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
@Table(name= "PAQUETE_GENERAL")
public class General implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4999223221435216050L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_general")
	private Integer id_general;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="servicio1")
	private String  servicio1;

	
	@Column(name="precio_general")
	private Double precio_general;
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_transporte")
	private Transporte transporte;
}

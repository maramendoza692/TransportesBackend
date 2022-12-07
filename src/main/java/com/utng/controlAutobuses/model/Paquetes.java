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
@Table(name= "PAQUETES")
public class Paquetes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2741064044806830105L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_paq")
	private Integer id_paq;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="servicio_1")
	private String servicio_1;
	
	@Column(name="servicio_2")
	private String servicio_2;
	
	@Column(name="servicio_3")
	private String servicio_3;
	
	@Column(name="servicio_4")
	private String servicio_4;
	
	@Column(name="precio")
	private Double precio;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_transp")
	private Transporte id_transp;
	
	
}

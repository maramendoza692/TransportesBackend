package com.utng.controlAutobuses.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name= "CATALOGO_TRANSPORTE")
public class Transporte implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -223876133697096164L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_transp")
	private Integer id_transp;
	
	
	@Column(name="nombre")
	private Integer nombre_transporte;
	
	@Column(name="precio_transp")
	private Integer precio_transporte;
	
	
	


}

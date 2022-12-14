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

@Getter
@Setter
@Entity
@Table(name= "CATALOGO_ORIGEN")
public class Origen implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 906802343873069983L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_origen")
	private Integer id_origen;
	
	@Column(name="nombre_origen")
	private String nombre;
}

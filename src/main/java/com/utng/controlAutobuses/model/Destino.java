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
@Table(name= "CATALOGO_DESTINO")
public class Destino implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6628959417022438579L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_destino")
	private Integer id_destino;

	@Column(name="nombre_destino")
	private String nombre_destino;
	
	@Column(name="precio")
	private String precio;
	

}

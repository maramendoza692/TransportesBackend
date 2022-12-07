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
@Table(name= "CATALOGO_HORARIO")
public class Horario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7368134874249668106L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_horario")
	private Integer id_horario;
	
	@Column(name="hora")	
	private String hora;
}

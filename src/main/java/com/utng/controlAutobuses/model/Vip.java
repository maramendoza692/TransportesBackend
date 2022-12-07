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
@Table(name= "PAQUETE_VIP")
public class Vip implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2343697348850740610L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_vip")
	private Integer id_vip;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="servicio1")
	private String  servicio1;
	
	@Column(name="servicio2")
	private String servicio2;
	
	@Column(name="servicio3")
	private String servicio3;
	
	@Column(name="servicio4")
	private String servicio4;
	
	@Column(name="precio_vip")
	private Double precio_vip;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_transporte")
	private Transporte transporte;

}

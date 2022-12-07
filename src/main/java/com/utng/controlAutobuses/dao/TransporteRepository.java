package com.utng.controlAutobuses.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.utng.controlAutobuses.model.Transporte;

public interface TransporteRepository extends JpaRepository<Transporte, Integer>{

	@Query("select a from Transporte a where a.id_transp = ?1") //?1 hace referencia a un parametro posicionalen "?1" se puede sustituir por :nombre y agregando @params("nombre") en la parte de abajo
	List<Transporte> mostrarPaquetes();
	
}

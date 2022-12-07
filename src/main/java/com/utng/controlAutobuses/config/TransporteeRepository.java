package com.utng.controlAutobuses.config;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.utng.controlAutobuses.model.Paquetes;
import com.utng.controlAutobuses.model.Transporte;

public interface TransporteeRepository extends JpaRepository<Transporte, Integer>{

	@Query("select a from Paquetes a where a.id_transp = ?1") //?1 hace referencia a un parametro posicionalen "?1" se puede sustituir por :nombre y agregando @params("nombre") en la parte de abajo
	List<Paquetes> mostrarPaquetes(Integer id_transp);
	

}

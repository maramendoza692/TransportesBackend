package com.utng.controlAutobuses.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utng.controlAutobuses.model.Destino;

public interface DestinoRepository extends JpaRepository<Destino, Integer>{
	
}

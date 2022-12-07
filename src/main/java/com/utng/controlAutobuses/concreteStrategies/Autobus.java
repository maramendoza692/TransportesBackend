package com.utng.controlAutobuses.concreteStrategies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.utng.controlAutobuses.dao.TransporteRepository;
import com.utng.controlAutobuses.model.Response;
import com.utng.controlAutobuses.model.Transporte;
import com.utng.controlAutobuses.service.ITransporteStrategy;

@Service
public class Autobus implements ITransporteStrategy {
   

	@Autowired
	private TransporteRepository transporteRepository;
	
	@Override
	public TipoTransporte getType() {
		return TipoTransporte.AUTOBUS;
	}

	@Override
	public Response<Transporte> mostrarPaquetes() {
		Response<Transporte> response = new Response<Transporte>();

		List<Transporte> lista = transporteRepository.mostrarPaquetes();
		
		if(lista.isEmpty()) {
			response.setMessage("No hay resultados");
			
		}else {
			response.setMessage("Consulta correcta");
		}
		response.setStatus("OK");
		response.setList(lista);
		response.setCount(lista.size());
		
		return response;
	}

	
}

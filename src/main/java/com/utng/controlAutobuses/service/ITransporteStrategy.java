package com.utng.controlAutobuses.service;

import com.utng.controlAutobuses.concreteStrategies.TipoTransporte;
import com.utng.controlAutobuses.model.Destino;
import com.utng.controlAutobuses.model.Response;
import com.utng.controlAutobuses.model.ResumenViaje;
import com.utng.controlAutobuses.model.ResumenViajeRequest;
import com.utng.controlAutobuses.model.Transporte;

public interface ITransporteStrategy {
	
	TipoTransporte getType();
	
	Response<Transporte> mostrarPaquetes();

	Response<ResumenViaje> confirmarViaje(ResumenViajeRequest viaje);
	
	

}

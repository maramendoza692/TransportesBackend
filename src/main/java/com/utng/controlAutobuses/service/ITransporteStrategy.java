package com.utng.controlAutobuses.service;

import com.utng.controlAutobuses.concreteStrategies.TipoTransporte;
import com.utng.controlAutobuses.model.Destino;
import com.utng.controlAutobuses.model.Response;

public interface ITransporteStrategy {
	
	TipoTransporte getType();
	
	String agregarDestino();
	String seleccionarPaquete();
	String calcularTotal();
	String resumenViaje();
	String pagar();
	String notificar();
	 
	//String getServicioInternet();
	
	String getRuta();
	
	/*Response<Autobus> getRuta(String ruta);
	Response<Autobus> getDestino(String destino);
	Response<Autobus> getOrigen(String origen);
	Response<Autobus> getHora(String hora);
	Response<Autobus> enviarMensaje();*/
	
	//Response<Autobus> getAutobusPorTipo(String tipo);
}

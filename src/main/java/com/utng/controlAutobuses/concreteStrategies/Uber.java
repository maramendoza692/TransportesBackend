package com.utng.controlAutobuses.concreteStrategies;

import org.springframework.stereotype.Service;

import com.utng.controlAutobuses.model.Destino;
import com.utng.controlAutobuses.model.Response;
import com.utng.controlAutobuses.service.ITransporteStrategy;

@Service
public class Uber implements ITransporteStrategy {
   

	@Override
	public TipoTransporte getType() {
		return TipoTransporte.UBER;
	}

	@Override
	public String getRuta() {
		// TODO Auto-generated method stub
		return "Ubeeerrr";
	}

	@Override
	public String agregarDestino() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String seleccionarPaquete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calcularTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String resumenViaje() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pagar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String notificar() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*@Override
	public Response<Autobus> getRuta(String ruta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<Autobus> getDestino(String destino) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<Autobus> getOrigen(String origen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<Autobus> getHora(String hora) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<Autobus> enviarMensaje() {
		// TODO Auto-generated method stub
		return null;
	}*/

	
}

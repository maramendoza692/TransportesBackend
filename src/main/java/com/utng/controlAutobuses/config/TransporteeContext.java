package com.utng.controlAutobuses.config;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utng.controlAutobuses.concreteStrategies.TipoTransporte;
import com.utng.controlAutobuses.dao.DestinoRepository;
import com.utng.controlAutobuses.dao.OrigenRepository;
import com.utng.controlAutobuses.dao.PaquetesRepository;
import com.utng.controlAutobuses.dao.ResumenViajeRepository;
import com.utng.controlAutobuses.dao.TransporteRepository;
import com.utng.controlAutobuses.model.Destino;
import com.utng.controlAutobuses.model.Origen;
import com.utng.controlAutobuses.model.Paquetes;
import com.utng.controlAutobuses.model.Response;
import com.utng.controlAutobuses.model.ResumenViaje;
import com.utng.controlAutobuses.model.ResumenViajeRequest;
import com.utng.controlAutobuses.model.Transporte;

@Service
public class TransporteeContext implements IService {
   

	@Autowired
	private TransporteeRepository transporteeRepository;
	
	@Autowired
	private ResumenViajeRepository resumenViajeRepository;
	
	@Autowired 
	private OrigenRepository origenRepository;
	
	@Autowired 
	private DestinoRepository destinoRepository;
	
	@Autowired
	private PaquetesRepository paquetesRepository;

	@Override
	public Response<Paquetes> mostrarPaquetes(Integer id_transp) {
		Response<Paquetes> response = new Response<Paquetes>();

		List<Paquetes> lista = transporteeRepository.mostrarPaquetes(id_transp);
		
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
	
	@Override
	public Response<ResumenViaje> confirmarViaje(ResumenViajeRequest viaje) {
		
		Response<ResumenViaje> response= new Response<ResumenViaje>();
		
		Optional<Origen> optionalOrigen= origenRepository.findById(viaje.getId_origen());
		Origen origen= null;
		
		Optional<Destino> optionalDestino= destinoRepository.findById(viaje.getId_destino());
		Destino destino= null;
		
		Optional<Paquetes> optionalPaquetes= paquetesRepository.findById(viaje.getId_paq());
		Paquetes paquetes= null;
		
		ResumenViaje viaje1 =null;
		ResumenViaje viaje2 =null;
		
		
		if(optionalOrigen.isPresent()) {
			
			if(optionalDestino.isPresent()) {
				
				if(optionalPaquetes.isPresent()) {
				
				origen = optionalOrigen.get();
				destino = optionalDestino.get();
				paquetes =optionalPaquetes.get();
				
				viaje1= new ResumenViaje();
				
				viaje1.setId_origen(origen);
				viaje1.setId_destino(destino);
				viaje1.setId_paq(paquetes);
				viaje1.setFecha(viaje.getFecha());
				viaje1.setHora(viaje.getHora());
				viaje1.setTotal(viaje.getTotal());
				
				
				viaje2= resumenViajeRepository.save(viaje1);
				
				response.setStatus("OK");
				response.setMessage("Guardado Correctamente");
				response.setData(viaje2);
			}else {
				response.setStatus("ERROR");
				response.setMessage("Datos No Existentes");
				response.setData(null);
			}
				}
					}
				
		
		return response;
		
	}

	@Override
	public TipoTransporte getType() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}


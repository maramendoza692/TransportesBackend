package com.utng.controlAutobuses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utng.controlAutobuses.concreteStrategies.TipoTransporte;
import com.utng.controlAutobuses.config.TransporteeContext;
import com.utng.controlAutobuses.dao.TransporteRepository;
import com.utng.controlAutobuses.service.TransporteContext;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.utng.controlAutobuses.model.Paquetes;
import com.utng.controlAutobuses.model.Response;
import com.utng.controlAutobuses.model.ResumenViaje;
import com.utng.controlAutobuses.model.ResumenViajeRequest;
import com.utng.controlAutobuses.model.Transporte;

@RestController
@RequestMapping("transporte/")
public class TransporteController {
    @Autowired
    private TransporteeContext transporteContext;
    
    
    public TransporteController(TransporteeContext transporteContext) {
    	this.transporteContext = transporteContext;
    }
    
    @GetMapping(path = "/{tipoTransporte}", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<Paquetes>> mostrarPaquetes (@PathVariable("tipoTransporte") Integer id_transp){ // pathVariable = solo se mandará una variable la cual será el id de solo un objeto
		
		
		Response<Paquetes> response = transporteContext.mostrarPaquetes(id_transp);
		
		return new ResponseEntity<Response<Paquetes>> (response,HttpStatus.OK);
		
	}
    
    @PostMapping(path = "/confirmarViaje",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<ResumenViaje>> confirmarViaje (@RequestBody ResumenViajeRequest viaje){
	
		Response<ResumenViaje> response = transporteContext.confirmarViaje(viaje);
		return new ResponseEntity<Response<ResumenViaje>> (response, HttpStatus.OK);
	}
    
    
    
    
}
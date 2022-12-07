package com.utng.controlAutobuses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utng.controlAutobuses.concreteStrategies.TipoTransporte;
import com.utng.controlAutobuses.dao.TransporteRepository;
import com.utng.controlAutobuses.service.TransporteContext;
import com.utng.controlAutobuses.model.Response;
import com.utng.controlAutobuses.model.Transporte;

@RestController
@RequestMapping("transporte/")
public class TransporteController {
    @Autowired
    private TransporteContext transporteContext;
    
    
    public TransporteController(TransporteContext transporteContext) {
    	this.transporteContext = transporteContext;
    }
    
    @GetMapping(path = "/{tipoTransporte}", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<Transporte>> mostrarPaquetes (@PathVariable("tipoTransporte") TipoTransporte tipoTransporte){ // pathVariable = solo se mandará una variable la cual será el id de solo un objeto
		
		
		Response<Transporte> response = transporteContext.mostrarPaquetes(tipoTransporte);
		
		return new ResponseEntity<Response<Transporte>> (response,HttpStatus.OK);
		
	}
    
    
    
    
}
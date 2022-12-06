package com.utng.controlAutobuses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utng.controlAutobuses.concreteStrategies.TipoTransporte;
import com.utng.controlAutobuses.service.TransporteContext;

@RestController
@RequestMapping("transporte/")
public class AutobusController {
    @Autowired
    private TransporteContext transporteContext;
    
    public AutobusController(TransporteContext transporteContext) {
    	this.transporteContext = transporteContext;
    }
    
    @GetMapping("/{tipoautobus}")
    public String getRuta(@PathVariable("tipoautobus")TipoTransporte tipoTransporte) {
    	return this.transporteContext.getRuta(tipoTransporte);
    }

    /*@GetMapping("/{tipoautobus}")
    public ResponseEntity<String> getType(@PathVariable("tipoautobus")TipoAutobus tipoAutobus) {
        return new ResponseEntity<String>(this.autobusContext.getRuta(tipoAutobus), HttpStatus.OK);
    }*/
    
    
}
package com.utng.controlAutobuses.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.utng.controlAutobuses.concreteStrategies.TipoTransporte;
import com.utng.controlAutobuses.model.Response;
import com.utng.controlAutobuses.model.Transporte;

@Service
public class TransporteContext implements InitializingBean{
		 
	 @Autowired
	    private List<ITransporteStrategy> transporteStrategies;
	    private Map<TipoTransporte,ITransporteStrategy> map;
	    
	    public TransporteContext(List<ITransporteStrategy> transporteStrategies) {
	    	this.transporteStrategies = transporteStrategies;
	    }
	    
	    @Override
		public void afterPropertiesSet() throws Exception {
	    	this.map = new HashMap<>();
	    	transporteStrategies.forEach(autobusStrategies -> map.put(autobusStrategies.getType(), autobusStrategies));
	    }

	    public Response<Transporte> mostrarPaquetes(TipoTransporte tipoTransporte){
	    	this.map = new HashMap<>();
	    	return this.map.get(tipoTransporte).mostrarPaquetes();
	    }
	    
	    
}
		

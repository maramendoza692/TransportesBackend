package com.utng.controlAutobuses.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.utng.controlAutobuses.concreteStrategies.TipoTransporte;

@Component
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


	    public String getRuta(TipoTransporte tipoPaquete) {
	    	
	    	return this.map.get(tipoPaquete).getRuta();
	    }
	    
	    /*
	    public Response<Autobus> getRuta(TipoAutobus tipoAutobus) {
	        return this.map.get(tipoAutobus).getRuta("ruta");
	    }
	    
	    public Response<Autobus> getDestino(TipoAutobus tipoAutobus) {
	        return this.map.get(tipoAutobus).getDestino(null);
	    }
	    
	    public Response<Autobus> getOrigen(TipoAutobus tipoAutobus) {
	        return this.map.get(tipoAutobus).getOrigen(null);
	    }
	    
	    public Response<Autobus> getHora(TipoAutobus tipoAutobus) {
	        return this.map.get(tipoAutobus).getHora(null);
	    }*/

}
		

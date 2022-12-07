package com.utng.controlAutobuses.config;

import com.utng.controlAutobuses.concreteStrategies.TipoTransporte;
import com.utng.controlAutobuses.model.Paquetes;
import com.utng.controlAutobuses.model.Response;
import com.utng.controlAutobuses.model.ResumenViaje;
import com.utng.controlAutobuses.model.ResumenViajeRequest;
import com.utng.controlAutobuses.model.Transporte;

public interface IService {

	Response<Paquetes> mostrarPaquetes(Integer id_transp);

	Response<ResumenViaje> confirmarViaje(ResumenViajeRequest viaje);

	TipoTransporte getType();

}

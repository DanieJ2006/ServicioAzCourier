package com.idat.BackendDAM.service;

import java.util.List;
import com.idat.BackendDAM.model.Entrega;

public interface EntregaService {
	
	List<Entrega> listar(Integer idRepartidor);
	List<Entrega> historial(Integer idRepartidor, String fecha);
	Entrega obtener(Integer id);
	void confirmarEntrega(Integer id);

}

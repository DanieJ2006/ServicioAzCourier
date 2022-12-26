package com.idat.BackendDAM.service;

import java.util.List;

import com.idat.BackendDAM.model.Repartidor;

public interface RepartidorService {
	
	List<Repartidor> listar();
	Repartidor obtener(Integer id);
}

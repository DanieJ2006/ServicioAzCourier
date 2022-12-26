package com.idat.BackendDAM.service;

import java.util.List;

import com.idat.BackendDAM.model.Paquete;

public interface PaqueteService {

	List<Paquete> listar();
	Paquete obtener(Integer id);
}

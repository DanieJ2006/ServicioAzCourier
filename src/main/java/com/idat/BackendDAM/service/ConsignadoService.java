package com.idat.BackendDAM.service;

import java.util.List;

import com.idat.BackendDAM.model.Consignado;

public interface ConsignadoService {

	List<Consignado> listar();
	Consignado obtener(Integer id);
	
}

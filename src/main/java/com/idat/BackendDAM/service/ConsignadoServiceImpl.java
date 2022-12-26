package com.idat.BackendDAM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.BackendDAM.model.Consignado;
import com.idat.BackendDAM.repository.ConsignadoRepository;

@Service
public class ConsignadoServiceImpl implements ConsignadoService{

	@Autowired
	private ConsignadoRepository repository;
	
	@Override
	public List<Consignado> listar() {
		return repository.findAll();
	}

	@Override
	public Consignado obtener(Integer id) {
		return repository.findById(id).orElse(null);
	}

}

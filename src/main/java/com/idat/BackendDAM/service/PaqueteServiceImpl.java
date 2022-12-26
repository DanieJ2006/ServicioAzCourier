package com.idat.BackendDAM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.BackendDAM.model.Paquete;
import com.idat.BackendDAM.repository.PaqueteRepository;

@Service
public class PaqueteServiceImpl implements PaqueteService {
	
	@Autowired
	private PaqueteRepository repository;

	@Override
	public List<Paquete> listar() {
		return repository.findAll();
	}

	@Override
	public Paquete obtener(Integer id) {
		return repository.findById(id).orElse(null);
	}

}

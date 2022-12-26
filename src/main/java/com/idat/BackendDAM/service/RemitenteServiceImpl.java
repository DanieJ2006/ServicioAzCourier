package com.idat.BackendDAM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.BackendDAM.model.Remitente;
import com.idat.BackendDAM.repository.RemitenteRepository;

@Service
public class RemitenteServiceImpl implements RemitenteService {
	
	@Autowired
	private RemitenteRepository repository;

	@Override
	public List<Remitente> lista() {
		return repository.findAll();
	}

	@Override
	public Remitente obtener(Integer idRemitente) {
		return repository.findById(idRemitente).orElse(null);
	}

}

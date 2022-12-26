package com.idat.BackendDAM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.BackendDAM.model.Repartidor;
import com.idat.BackendDAM.repository.RepartidorRepository;

@Service
public class RepartidorServiceImpl implements RepartidorService{
	
	@Autowired
	private RepartidorRepository repartidorRepository;

	@Override
	public List<Repartidor> listar() {
		// TODO Auto-generated method stub
		return repartidorRepository.findAll();
	}

	@Override
	public Repartidor obtener(Integer id) {
		// TODO Auto-generated method stub
		return repartidorRepository.findById(id).orElse(null);
	}

}

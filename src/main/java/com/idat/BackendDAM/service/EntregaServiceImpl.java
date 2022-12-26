package com.idat.BackendDAM.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.BackendDAM.model.Entrega;
import com.idat.BackendDAM.repository.EntregaRepository;

@Service
public class EntregaServiceImpl implements EntregaService {

	@Autowired
	private EntregaRepository repository;
	
	@Override
	public List<Entrega> listar(Integer idRepartidor) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime now = LocalDateTime.now();
		String today = dtf.format(now);
		
		List<Entrega> lstAllEntrega = repository.findAll();
		List<Entrega> result = new ArrayList<>();
		for (Entrega entrega : lstAllEntrega ) {
			if(entrega.getRepartidor().getIdRepartidor() == idRepartidor
					&&
			   entrega.getFecha().equals(today)
					&&
			   entrega.getEstado().equals("EN PROCESO")) {
				result.add(entrega);
			}
		}
		return result;
	}

	@Override
	public Entrega obtener(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void confirmarEntrega(Integer id) {
		Entrega foundEntrega = obtener(id);
		if(foundEntrega != null) {
			foundEntrega.setEstado("ENTREGADO");
			repository.saveAndFlush(foundEntrega);
		}
	}

	@Override
	public List<Entrega> historial(Integer idRepartidor, String fecha) {
		List<Entrega> lstAllEntrega = repository.findAll();
		List<Entrega> result = new ArrayList<>();
		for (Entrega entrega : lstAllEntrega ) {
			if(entrega.getRepartidor().getIdRepartidor() == idRepartidor
					&&
			   entrega.getEstado().equals("ENTREGADO")
					&&
			   entrega.getFecha().equals(fecha)) {
				result.add(entrega);
			}
		}
		return result;
	}

}

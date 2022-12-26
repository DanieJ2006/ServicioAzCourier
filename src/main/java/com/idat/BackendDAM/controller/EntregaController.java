package com.idat.BackendDAM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.idat.BackendDAM.model.Entrega;
import com.idat.BackendDAM.service.EntregaService;
import com.idat.BackendDAM.service.UtilService;

@Controller
@RequestMapping("/v1/entrega")
public class EntregaController {

	@Autowired
	private EntregaService service;
	
	@Autowired
	private UtilService utils;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Entrega>> listar(OAuth2Authentication auth){
		Integer id = utils.getIdByUsername(auth);
		return new ResponseEntity<List<Entrega>>(service.listar(id), HttpStatus.OK) ;
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Entrega> obtenerPorId(@PathVariable Integer id){
		Entrega entrega = service.obtener(id);
		if( entrega != null) {
			return new ResponseEntity<Entrega>(entrega, HttpStatus.OK);
		}else {
			return new ResponseEntity<Entrega>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/historial/{fecha}", method = RequestMethod.GET)
	public ResponseEntity<List<Entrega>> listarHistorial(OAuth2Authentication auth, @PathVariable String fecha){
		Integer id = utils.getIdByUsername(auth);
		return new ResponseEntity<List<Entrega>>(service.historial(id, fecha), HttpStatus.OK) ;
	}
	
	@RequestMapping(path = "/historial/obtener/{id}", method = RequestMethod.GET)
	public ResponseEntity<Entrega> obtenerHistorialPorId(@PathVariable Integer id){
		Entrega entrega = service.obtener(id);
		if( entrega != null) {
			return new ResponseEntity<Entrega>(entrega, HttpStatus.OK);
		}else {
			return new ResponseEntity<Entrega>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@RequestMapping(path="/confirmar/{id}", method = RequestMethod.POST)
	public ResponseEntity<Void> confirmarEntrega(@PathVariable Integer id){
		service.confirmarEntrega(id);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
}

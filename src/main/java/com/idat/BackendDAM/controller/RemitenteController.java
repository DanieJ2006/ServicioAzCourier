package com.idat.BackendDAM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.idat.BackendDAM.model.Remitente;
import com.idat.BackendDAM.service.RemitenteService;

@Controller
@RequestMapping("/v1/remitente")
public class RemitenteController {
	
	@Autowired
	private RemitenteService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Remitente>> listar(){
		return new ResponseEntity<List<Remitente>>(service.lista(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Remitente> obtenerPorId(@PathVariable Integer id){
		Remitente remitente = service.obtener(id);
		if(remitente != null) {
			return new ResponseEntity<Remitente>(remitente, HttpStatus.OK);
		}else {
			return new ResponseEntity<Remitente>(remitente, HttpStatus.NOT_FOUND);
		}
	}

}

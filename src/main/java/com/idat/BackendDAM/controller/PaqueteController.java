package com.idat.BackendDAM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.idat.BackendDAM.model.Paquete;
import com.idat.BackendDAM.service.PaqueteService;

@Controller
@RequestMapping("/v1/paquete")
public class PaqueteController {
	
	@Autowired
	private PaqueteService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Paquete>> listar(){
		return new ResponseEntity<List<Paquete>>(service.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Paquete> obtenerPorId(@PathVariable Integer id){
		Paquete paquete = service.obtener(id);
		if(paquete != null) {
			return new ResponseEntity<Paquete>(paquete, HttpStatus.OK);
		}else {
			return new ResponseEntity<Paquete>(paquete, HttpStatus.NOT_FOUND);
		}
	}

}

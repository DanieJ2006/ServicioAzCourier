package com.idat.BackendDAM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.idat.BackendDAM.model.Consignado;
import com.idat.BackendDAM.service.ConsignadoService;

@Controller
@RequestMapping("/v1/consignado")
public class ConsignadoController {

	@Autowired
	private ConsignadoService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Consignado>> listar(){
		return new ResponseEntity<List<Consignado>>(service.listar(), HttpStatus.OK) ;
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Consignado> obtenerPorId(@PathVariable Integer id){
		
		Consignado consignado = service.obtener(id);
		
		if( consignado != null) {
			return new ResponseEntity<Consignado>(consignado, HttpStatus.OK);
		}else {
			return new ResponseEntity<Consignado>(HttpStatus.NOT_FOUND);
		}
		
	}
	
}

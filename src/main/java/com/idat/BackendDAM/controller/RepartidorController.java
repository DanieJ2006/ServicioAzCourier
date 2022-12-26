package com.idat.BackendDAM.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.idat.BackendDAM.model.Repartidor;
import com.idat.BackendDAM.service.RepartidorService;
import com.idat.BackendDAM.service.UtilService;

@Controller
@RequestMapping("/v1/repartidor")
public class RepartidorController {
	

	@Autowired
	private RepartidorService service;
	
	@Autowired
	private UtilService utils;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Repartidor>> listar(){		
		return new ResponseEntity<List<Repartidor>>(service.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/perfil", method = RequestMethod.GET)
	public ResponseEntity<Repartidor> obtenerPorId(OAuth2Authentication auth){
		Integer id = utils.getIdByUsername(auth);
		Repartidor repartidor = service.obtener(id);
		
		if( repartidor != null) {
			return new ResponseEntity<Repartidor>(repartidor, HttpStatus.OK);
		}else {
			return new ResponseEntity<Repartidor>(HttpStatus.NOT_FOUND);
		}
	}

}

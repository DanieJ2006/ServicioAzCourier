package com.idat.BackendDAM.service;

import java.util.List;
import com.idat.BackendDAM.model.Remitente;

public interface RemitenteService {
	
	List<Remitente> lista();
	Remitente obtener(Integer idRemitente);

}

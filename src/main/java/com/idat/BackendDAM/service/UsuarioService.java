package com.idat.BackendDAM.service;

import java.util.List;

import com.idat.BackendDAM.model.Usuario;

public interface UsuarioService {
	
	List<Usuario> listar();
	Usuario obtener(Integer id);

}

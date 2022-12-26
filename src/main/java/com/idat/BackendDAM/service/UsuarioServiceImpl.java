package com.idat.BackendDAM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.BackendDAM.model.Usuario;
import com.idat.BackendDAM.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository repository;

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Usuario obtener(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}

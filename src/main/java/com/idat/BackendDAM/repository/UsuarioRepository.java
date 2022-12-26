package com.idat.BackendDAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.BackendDAM.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Usuario findByUsuario(String usuario);

}

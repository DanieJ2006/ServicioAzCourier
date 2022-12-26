package com.idat.BackendDAM.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.idat.BackendDAM.model.Usuario;
import com.idat.BackendDAM.repository.UsuarioRepository;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	//esto va a permitir acceder al metodo
    @Autowired
    private UsuarioRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usu = repository.findByUsuario(username);

		if (usu != null) {

			List<GrantedAuthority> listGranted = new ArrayList<>();
			GrantedAuthority granted = new SimpleGrantedAuthority(usu.getRol());
			listGranted.add(granted);

			return new User(usu.getUsuario(), usu.getPassword(), listGranted);
		} else {
			throw new UsernameNotFoundException("Usuario no existe " + username);
		}
	}

}

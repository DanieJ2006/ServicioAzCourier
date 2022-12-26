package com.idat.BackendDAM.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.oauth2.common.util.JsonParser;
import org.springframework.security.oauth2.common.util.JsonParserFactory;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.stereotype.Service;

import com.idat.BackendDAM.model.Usuario;
import com.idat.BackendDAM.repository.UsuarioRepository;

@Service
public class UtilServiceImpl implements UtilService{

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Integer getIdByUsername(OAuth2Authentication token) {
		final OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) token.getDetails();
		String accessToken = details.getTokenValue();
		JsonParser parser = JsonParserFactory.create();
        Map<String, ?> tokenData = parser.parseMap(JwtHelper.decode(accessToken).getClaims());
        String username = (String) tokenData.get("user_name");
        Usuario foundUsuario = repository.findByUsuario(username);
		return foundUsuario.getIdUsuario();
	}

	
	
}

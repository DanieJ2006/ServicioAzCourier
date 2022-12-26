package com.idat.BackendDAM.service;

import org.springframework.security.oauth2.provider.OAuth2Authentication;

public interface UtilService {

	Integer getIdByUsername(OAuth2Authentication token);
	
}

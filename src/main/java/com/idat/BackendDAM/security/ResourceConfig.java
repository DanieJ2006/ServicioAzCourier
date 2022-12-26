package com.idat.BackendDAM.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class ResourceConfig extends ResourceServerConfigurerAdapter {
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		// TODO Auto-generated method stub
		super.configure(resources);
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		http.anonymous().disable();
		
		http.authorizeRequests()
		.antMatchers("/v1/consignado/**").permitAll()
		.antMatchers("/v1/entrega/**").permitAll()
		.antMatchers("/v1/paquete/**").permitAll()
		.antMatchers("/v1/remitente/**").permitAll()
		.antMatchers("/v1/repartidor/**").permitAll()
		.and()
		.exceptionHandling()
		.accessDeniedHandler(new OAuth2AccessDeniedHandler());
	}

}

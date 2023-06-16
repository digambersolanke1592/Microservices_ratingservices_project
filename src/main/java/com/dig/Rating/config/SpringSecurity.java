package com.dig.Rating.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)  //for security at api/method level with @preAuthorized annotation we aalow who can access that api/method 
public class SpringSecurity {

	@Bean
	public SecurityFilterChain securityFilterChain (HttpSecurity security)throws Exception {
		
		security.authorizeHttpRequests()
		        .anyRequest()
		        .authenticated()
		        .and()
		        .oauth2ResourceServer()
		        .jwt();
		
		return security.build();
	}
}

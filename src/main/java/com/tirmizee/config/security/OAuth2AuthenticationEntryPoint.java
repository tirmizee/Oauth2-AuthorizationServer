package com.tirmizee.config.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;

public class OAuth2AuthenticationEntryPoint extends org.springframework.security.oauth2.provider.error.OAuth2AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		System.out.println("commence : " + authException.getMessage());
		super.commence(request, response, authException);
	}

	@Override
	protected ResponseEntity<?> enhanceResponse(ResponseEntity<?> response, Exception exception) {
		System.out.println("enhanceResponse : " + exception.getMessage());
		return super.enhanceResponse(response, exception);
	}

}

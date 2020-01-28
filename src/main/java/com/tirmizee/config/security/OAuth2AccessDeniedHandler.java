package com.tirmizee.config.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;


/**
 * @author Pratya Yeekhaday
 *
 */
public class OAuth2AccessDeniedHandler extends org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException authException)
			throws IOException, ServletException {
		System.out.println("AccessDeniedException : " + authException.getMessage());
		super.handle(request, response, authException);
	}
	
}

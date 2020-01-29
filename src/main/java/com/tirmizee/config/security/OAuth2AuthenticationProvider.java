package com.tirmizee.config.security;

import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class OAuth2AuthenticationProvider extends DaoAuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		try {
			return super.authenticate(authentication);
		} catch (AuthenticationException e) {
			System.out.println("OAuth2AuthenticationProvider : " + e.getMessage());
			throw e;
		}
	}
	
}

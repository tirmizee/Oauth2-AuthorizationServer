package com.tirmizee.config.security;

import org.springframework.security.authentication.DefaultAuthenticationEventPublisher;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Oauth2AuthenticationEventPublisher extends DefaultAuthenticationEventPublisher {

	@Override
	public void publishAuthenticationSuccess(Authentication authentication) {
		log.debug("publishAuthenticationSuccess : {}" ,authentication.getName());
		super.publishAuthenticationSuccess(authentication);
	}

	@Override
	public void publishAuthenticationFailure(AuthenticationException exception, Authentication authentication) {
		log.debug("publishAuthenticationFailure : {}", exception.getMessage());
		super.publishAuthenticationFailure(exception, authentication);
	}

}

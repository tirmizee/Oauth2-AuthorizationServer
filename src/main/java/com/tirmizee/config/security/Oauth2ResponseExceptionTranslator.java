package com.tirmizee.config.security;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Oauth2ResponseExceptionTranslator implements WebResponseExceptionTranslator<OAuth2Exception>{

	@Override
	public ResponseEntity<OAuth2Exception> translate(Exception exception) throws Exception {
		log.debug("Oauth2ResponseExceptionTranslator : " + exception.getMessage());
		System.out.println("Oauth2ResponseExceptionTranslator : " + exception.getMessage());
		return ResponseEntity.status(HttpStatus.OK).body(new OAuth2Exception(exception.getMessage()));
	}

}

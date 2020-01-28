package com.tirmizee.config;

import java.io.FileFilter;

import javax.servlet.Filter;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.common.exceptions.ClientAuthenticationException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.tirmizee.config.security.Oauth2ResponseExceptionTranslator;

@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

	static final String CLIEN_ID = "angular-client";
	static final String CLIENT_SECRET = "{noop}angular-secret";
	static final String SCOPE_READ = "read";
	static final String SCOPE_WRITE = "write";
	static final String TRUST = "trust";
	static final int ACCESS_TOKEN_VALIDITY_SECONDS = 1*60*60;
    static final int FREFRESH_TOKEN_VALIDITY_SECONDS = 6*60*60;

    @Autowired
	private TokenStore tokenStore;
    
    @Autowired
	private DataSource dataSource;

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private PasswordEncoder noOpPasswordEncoder;

	OAuth2Exception s;
	WebResponseExceptionTranslator ll;
	AuthenticationEntryPoint oo;
	ClientAuthenticationException  yy;
	AccessTokenConverter ss;
	Filter d;
	
	@Override
	public void configure(ClientDetailsServiceConfigurer configurer) throws Exception {
		configurer
			.jdbc(dataSource)
				.passwordEncoder(noOpPasswordEncoder);
//					.withClient(CLIEN_ID)
//					.secret(CLIENT_SECRET)
//					.authorizedGrantTypes(
//						OAuth2Utils.GRANT_TYPE_PASSWORD, 
//						OAuth2Utils.GRANT_TYPE_AUTHORIZATION_CODE, 
//						OAuth2Utils.GRANT_TYPE_REFRESH_TOKEN, 
//						OAuth2Utils.GRANT_TYPE_IMPLICIT )
//					.scopes(SCOPE_READ, SCOPE_WRITE, TRUST)
//					.accessTokenValiditySeconds(ACCESS_TOKEN_VALIDITY_SECONDS)
//					.refreshTokenValiditySeconds(FREFRESH_TOKEN_VALIDITY_SECONDS);
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints
			.tokenStore(tokenStore)
			.authenticationManager(authenticationManager)
			.exceptionTranslator(new Oauth2ResponseExceptionTranslator());
	}
	
}

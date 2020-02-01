package com.tirmizee.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

import com.tirmizee.config.security.OAuth2AuthenticationEntryPoint;
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
	private DataSource dataSource;
    
    @Autowired 
	private TokenStore tokenStore;
    
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private PasswordEncoder noOpPasswordEncoder;

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
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
        oauthServer
        	.tokenKeyAccess("permitAll()")
            .checkTokenAccess("isAuthenticated()")
            .authenticationEntryPoint(new OAuth2AuthenticationEntryPoint());
    }
	
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints
			.tokenStore(tokenStore)
			.authenticationManager(authenticationManager)
			.exceptionTranslator(new Oauth2ResponseExceptionTranslator());
	}
	
}

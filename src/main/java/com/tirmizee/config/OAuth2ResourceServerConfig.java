package com.tirmizee.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.tirmizee.config.security.OAuth2AuthenticationEntryPoint;

@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {
	
	private static final String RESOURCE_ID = "resource_id";
	
	AuthenticationEntryPoint ll;
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
//		resources
//			.resourceId(RESOURCE_ID).stateless(false);
//			
//			.authenticationEntryPoint(new OAuth2AuthenticationEntryPoint());
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
        http
            .anonymous().disable()
            .authorizeRequests()
            .antMatchers("/api/**").authenticated()
            .and()
            .exceptionHandling()
            	.authenticationEntryPoint(new OAuth2AuthenticationEntryPoint());
	}
	
}

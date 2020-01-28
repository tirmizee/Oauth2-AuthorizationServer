package com.tirmizee.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.tirmizee.config.security.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;
	
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Override
    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    public AuthenticationManager authenticationManagerBean() throws Exception {
	    return super.authenticationManagerBean();
    }

    @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
	    	.userDetailsService(userDetailsService)
	    	.passwordEncoder(passwordEncoder());
	}

	/*
	 * @Autowired public void globalUserDetails(AuthenticationManagerBuilder auth)
	 * throws Exception { auth .userDetailsService(userDetailsService)
	 * .passwordEncoder(passwordEncoder()); }
	 */

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .anonymous().disable()
            .authorizeRequests()
            .antMatchers ("/oauth/token").permitAll()
            .antMatchers("/api-docs/**").permitAll();
//            .and()
//            .exceptionHandling()
//            	.authenticationEntryPoint(new OAuth2AuthenticationEntryPoint());
//            	.accessDeniedHandler(new OAuth2AccessDeniedHandler());
    }

    @Bean
    public TokenStore tokenStore() {
        return new JdbcTokenStore(dataSource);
    }

    @Bean public PasswordEncoder passwordEncoder(){ 
	    return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
 
    @SuppressWarnings("deprecation")
    @Bean
    public PasswordEncoder noOpPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
    
    @Bean
    public PasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public FilterRegistrationBean<CorsFilter> corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<CorsFilter>(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }
	
}
